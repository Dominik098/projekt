<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<%@ page import="java.sql.*" %>


 <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="C_kategorie.css" type="text/css">

    <link rel="icon" type="image/png" href="3.png" sizes="96x96" />
    <title>Kategorie książek </title>

    
    
</head>

<body>
    <tr>
        <td align="center"><img src="logo.jpg" name="ksiazka" align="left" weight="90px" height="50px"></td>
    </tr>
    <h1>
        <center><u>Kategorie książek</u></center>
    </h1>
    <header>
        <nav>
            <ul>
                <li class="znacznik" ><a href="A_strona-gl.jsp"><button class="wyloguj" >Strona główna</button></a></li>
                <li class="znacznik" ><a href="B_O bibiotece.jsp"><button class="wyloguj" >O bibliotece</button></a></li>
                <li  class="znacznik"><a href="C_Kategorie książek.jsp"><button class="wyloguj" >Kategorie książek</button></a></li>
                <!--   <li><a href="D_Wypożyczenia.jsp"><button class="pobierz" >Wypożyczane </a></li>-->
                <li class="znacznik"><a href="E_Słownik pojęć.jsp"><button class="wyloguj" >Słownik pojęć bibliotecznych</button></a></li>
                <li class="znacznik"><a href="F_personel.jsp"><button class="wyloguj" >Personel</button></a></li>
               <!-- <li class="znacznik"><a href="G_login.jsp">Logowanie</a></li>
                <li class="znacznik"><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                
                <li ><a > <%=session.getAttribute("email-login") %> </a></li>
                <li  ><a href="#" onclick="confirmLogout()"><button class="wyloguj" >Wyloguj się</button></a></li>
               
                
            </ul>

        </nav>

    </header>
	    <h1>Książki </h1>
	    



<a href="Dodaj_ksiazke.jsp">
  <button class="dodanie" onclick="return promptForPassword()">Przejdź do formularza<br> aby dodać książkę</button>
</a>

<script>
  // Funkcja sprawdzająca hasło
  function promptForPassword() {
    var password = "";
    var passwordField = document.createElement('input');
    passwordField.setAttribute('type', 'password');

    var promptContainer = document.createElement('div');
    promptContainer.style.position = 'absolute';
    promptContainer.style.top = '0';
    promptContainer.style.left = '0';
    promptContainer.style.display = 'flex';
    promptContainer.style.justifyContent = 'center';
    promptContainer.style.alignItems = 'center';
    promptContainer.style.width = '100%';
    promptContainer.style.height = '100%';
    promptContainer.style.backgroundColor = 'rgba(0, 0, 0, 0.5)';

    var promptBox = document.createElement('div');
    promptBox.style.backgroundColor = '#fff';
    promptBox.style.padding = '20px';
    promptBox.style.borderRadius = '5px';

    var promptText = document.createElement('p');
    promptText.textContent = 'Podaj hasło admina:';
    promptText.style.marginBottom = '10px';

    var buttonsContainer = document.createElement('div');
    buttonsContainer.style.display = 'flex';
    buttonsContainer.style.justifyContent = 'center';

    var cancelButton = document.createElement('button');
    cancelButton.textContent = 'Anuluj';
    cancelButton.style.marginRight = '10px';
    cancelButton.addEventListener('click', function() {
      document.body.removeChild(promptContainer);
    });

    var okButton = document.createElement('button');
    okButton.textContent = 'OK';
    okButton.addEventListener('click', validatePassword);

    buttonsContainer.appendChild(cancelButton);
    buttonsContainer.appendChild(okButton);

    promptBox.appendChild(promptText);
    promptBox.appendChild(passwordField);
    promptBox.appendChild(buttonsContainer);
    promptContainer.appendChild(promptBox);
    document.body.appendChild(promptContainer);

    passwordField.focus();

    passwordField.addEventListener('input', function(event) {
      password = event.target.value;
    });

    passwordField.addEventListener('keydown', function(event) {
      if (event.key === 'Enter') {
        validatePassword();
      }
    });

    function validatePassword() {
      document.body.removeChild(promptContainer);

      // Sprawdzenie, czy wprowadzone hasło jest poprawne
      if (password === "zaq1@WSX") {
        window.location.href = "Dodaj_ksiazke.jsp";
      } else {
        alert("Nieprawidłowe hasło!");
      }
    }

    return false;
  }
</script>






    <h3>Oto lista wszystkich książek dostępnych do wypożyczenia w bibliotece </h3>
    
<table>
    <tr>
        <th>Lp.</th>
        <th>Tytuł</th>
        <th>Autor</th>
        <th>Wydawnictwo</th>
        <th>Data_publikacj</th>
        <th>Książki w formacie PDF</th>
       
     
    </tr>
    <% 
        try {
            // Połączenie z bazą danych
            String url = "jdbc:mysql://localhost:3306/Biblioteka";
            String user = "root";
            String password = "P@ssw0rd";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Zapytanie SQL
            String sql = "SELECT * FROM Książki";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Wyświetlenie wyników zapytania
            int i=0;
            while (rs.next()) { i++;
                String tytuł = rs.getString("tytuł");
                String autor = rs.getString("autor");
                String wydawnictwo = rs.getString("wydawnictwo");
                String data_publikacji = rs.getString("data_publikacji");
                String pdf_link = rs.getString("pdf");
              
                
                
    %>
        <tr>
            <td><%= i %></td>
            <td><%= tytuł %></td>
            <td><%= autor %></td>
            <td><%= wydawnictwo %></td>
            <td><%= data_publikacji %></td>
            <td>
    <a href="<%= request.getContextPath() + pdf_link %>" target="_blank" download><button class="pobierz">Pobierz książkę </button></a>
</td>
        

        </tr>
    <% 
            }
            // Zamykanie połączenia z bazą danych
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    %>
</table>






<script type="text/javascript">

function confirmLogout() {
	if (confirm("Czy na pewno chcesz się wylogować?")) {
		window.location.href = "logout";
	}
}
    // Funkcja pobierająca plik PDF
    function pobierzPDF(link) {
        window.location.href = link;
    }
</script>
    
    

    <footer>
        <p>(c) 2023 Biblioteka Publiczna. Wszelkie prawa zastrzeżone.</p>
        <p>Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>

    </footer>



</body>

</html>