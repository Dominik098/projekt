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
                <li class="znacznik" ><a href="A_strona-gl.jsp">Strona główna</a></li>
                <li class="znacznik" ><a href="B_O bibiotece.jsp">O bibliotece</a></li>
                <li  class="znacznik"><a href="C_Kategorie książek.jsp">Kategorie książek </a></li>
                <!--   <li><a href="D_Wypożyczenia.jsp">Wypożyczane </a></li>-->
                <li class="znacznik"><a href="E_Słownik pojęć.jsp">Słownik pojęć bibliotecznych</a></li>
                <li class="znacznik"><a href="F_personel.jsp">Prersonel</a></li>
               <!-- <li class="znacznik"><a href="G_login.jsp">Logowanie</a></li>
                <li class="znacznik"><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                
                <li ><a > <%=session.getAttribute("email-login") %> </a></li>
                <li  ><a href= "logout"><button class="wyloguj" >Wyloguj się</button></a></li>
                
            </ul>

        </nav>

    </header>
    <h1>Księżki </h1>
    
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

<script>
    // Funkcja pobierająca plik PDF
    function pobierzPDF(link) {
        window.location.href = link;
    }
</script>
    

    <footer>
        <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</p>
        <p>Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>

    </footer>



</body>

</html>