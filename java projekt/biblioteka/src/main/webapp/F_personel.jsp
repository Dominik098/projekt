<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="F_personel.css">
    <link rel="icon" type="image/png" href="3.png" sizes="96x96" />
    <title>Personel</title>


</head>

<body>
    <tr>
        <td align="center"><img src="logo.jpg" name="ksiazka" align="left" weight="90px" height="50px"></td>
    </tr>
    <h1>
        <center><u>Personel biblioteki </u></center>
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
    <h1 id="cytat">„Im bardziej gęstnieje mrok, tym jaśniej świecą książki.” – Stanisław Zieliński</h1>

    <h1 id="Kadra">Kadra </h1>
    <div>
        <div class="Personel">
            <h3>dr hab. inż. Klaudia Wójcik, Dyrektor biblioteki </h3>
            <h3>dr hab. Anna Kowalska, Kierownik biblioteki </h3>
            <h4>mgr Paweł Nowak, bibliotekarz</h4>
            <h4>mgr Małgorzata Wiśniewska, bibliotekarz</h4>
            <h4>mgr inż. Karol Zawadzki, specjalista ds. informatyzacji biblioteki</h4>
            <h4>dr hab. Małgorzata Szymańska, konsultant naukowy biblioteki</h4>
            <h4>mgr Maria Jankowska, bibliotekarz</h4>
            <h4>dr hab. Marcin Kowalczyk, koordynator projektów naukowych biblioteki</h4>
            <h4>mgr Agnieszka Kwiatkowska, bibliotekarz młodszy</h4>
            <h4>mgr lic. Adam Słowik, archiwista biblioteczny</h4>
            <h4>dr inż. Janusz Wojciechowski, specjalista ds. technologii druku 3D w bibliotece</h4>
        </div>

        <div class="Kontakt">
            <img src="https://cdn.pixabay.com/photo/2019/04/26/18/41/books-4158244__340.jpg" alt="zdj" height="250px "
                width="500px">
            <h3 id="kontakt-napis">
                <center>Kontakt</center>
            </h3>

            <p>W razie pytań prosimy o kontak e-mail: infobiblio@interia.pl</p>
            <p>Jeśli chodzi o pytanie do konkretnej osoby to prosimy kontaktować się na ten sam e-mail co wyżej tylko w
                tytule podać konkretnego spoecjalistę.</p>

        </div>
    </div>
    <div class="footer">
        <span>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</span><br>
        <span>Adres: ul. Biblioteczna 1, 00-000 Miasto. Telefon: +48 123 456 789. E-mail: infobiblio@interia.pl</span>

    </div>

</body>

</html>