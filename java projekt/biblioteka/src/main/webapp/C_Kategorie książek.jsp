<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
                <li><a href="A_strona-gl.jsp">Strona główna</a></li>
                <li><a href="B_O bibiotece.jsp">O bibliotece</a></li>
                <li><a href="C_Kategorie książek.jsp">Kategorie książek </a></li>
                <li><a href="D_Wypożyczenia.jsp">Wypożyczane </a></li>
                <li><a href="E_Słownik pojęć.jsp">Słownik pojęć bibliotecznych</a></li>
                <li><a href="F_personel.jsp">Prersonel</a></li>
               <!-- <li><a href="G_login.jsp">Logowanie</a></li>
                <li><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                <li><a href= "logout">Wyloguj się</a></li>
                <li><a > <%=session.getAttribute("email-login") %> </a></li>
            </ul>

        </nav>

    </header>
    <h1>Księżki dostępne w naszej bibliotece</h1>
    <h3>Oto lista książek</h3>
    <span>
    <ol id="baza-danych">
        <li>
     
        
       
        
        
        </li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ol>
</span>


    <footer>
        <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</p>
        <p>Adres: ul. Biblioteczna 1, 00-217 Warszawa Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>

    </footer>



</body>

</html>