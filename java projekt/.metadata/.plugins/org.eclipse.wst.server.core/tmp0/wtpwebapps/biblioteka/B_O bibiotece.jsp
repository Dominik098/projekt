<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="icon" type="image/png" href="3.png" sizes="96x96" />
    <link rel="stylesheet" href="B_styl_info.css" type="text/css">
    <title>O bibliotece</title>

</head>

<body>
    <tr>
        <td align="center"><img src="logo.jpg" name="ksiazka" align="left" weight="90px" height="50px"></td>
    </tr>
    <h1>
        <center><u>Informacje o bibliotece </u></center>
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


    <h2>Witamy w naszej naukowej bibliotece </h2>
    <h3>"W bibliotece możemy odnaleźć drogę do mądrości przeszłych wieków i otworzyć drzwi do wiedzy dla przyszłych
        pokoleń."</h3>
    <img src="https://cdn.pixabay.com/photo/2017/07/02/09/03/books-2463779__340.jpg" slt="zdjęcie" style="float:left "
        width="400px" height="400px">
    <p>Biblioteka naukowa to miejsce, w którym zgromadzone są setki tysięcy książek, artykułów, czasopism i innych
        publikacji naukowych. Nasza biblioteka oferuje bogaty wybór zasobów z wielu dziedzin, takich jak <i> biologia,
            chemia, matematyka, fizyka, inżynieria, informatyka i wiele innych. </i>Ale również posiada gatunki książek
        np. <i>Fantastyka,Science fiction,Powieść historyczna,Romans,Kryminał i thriller,Powieść młodzieżowa,Literatura
            dziecięca,Biografia i reportaż,Literatura obyczajowa,Horror</i></p>

    <p>Nasi użytkownicy mają dostęp do najnowszych i najbardziej wartościowych publikacji naukowych, a także do narzędzi
        i programów edukacyjnych, które pomagają w prowadzeniu badań naukowych i rozwoju naukowego. Oferujemy również
        dostęp do baz danych i czasopism naukowych, dzięki czemu nasi użytkownicy mogą być na bieżąco z najnowszymi
        odkryciami naukowymi.</p>

    <p>Nasza biblioteka posiada zespół doświadczonych pracowników, którzy chętnie pomagają w znalezieniu potrzebnych
        zasobów oraz w udzielaniu porad i wskazówek dotyczących korzystania z naszych zasobów. Zapewniamy również dostęp
        do strefy czytelniczej, gdzie nasi użytkownicy mogą korzystać z wygodnych miejsc do pracy oraz z bezpłatnego
        dostępu do Internetu.</p>

    <p>Zapraszamy do naszej biblioteki naukowej, gdzie znajdziecie Państwo nie tylko bogate zasoby naukowe, ale także
        przyjazną atmosferę i profesjonalną obsługę.</p>

    <h2>Historia naszej biblioteki</h2>

    <img src="https://cdn.pixabay.com/photo/2017/08/07/19/07/books-2606859__340.jpg" alt="zdjęcie " width="600"
        height="510" style="float: right;">
    <p>Nasza biblioteka naukowa została założona w 1950 roku przez grupę pasjonatów nauki z różnych dziedzin. Początkowo
        biblioteka mieściła się w niewielkim pomieszczeniu na terenie uniwersytetu, lecz szybko zaczęła rozwijać się i
        zyskiwać na popularności wśród studentów i pracowników naukowych.</p>

    <p>W ciągu kolejnych dekad biblioteka rozbudowywała swoje zbiory i zapewniała coraz lepsze warunki pracy dla swoich
        użytkowników. W latach 80. XX wieku biblioteka przeniosła się do nowoczesnego budynku, który zaprojektowano
        specjalnie pod kątem potrzeb biblioteki naukowej. Nowy budynek zapewnił większą przestrzeń i nowoczesne
        rozwiązania technologiczne, które zwiększyły wygodę i efektywność korzystania z zasobów biblioteki.</p>

    <p>W ciągu kolejnych lat biblioteka stała się jednym z wiodących centrów naukowych w kraju, z zasobami obejmującymi
        setki tysięcy książek, czasopism, artykułów i innych publikacji naukowych z różnych dziedzin. Biblioteka stała
        się miejscem, w którym odbywały się liczne konferencje, seminaria, wystawy i inne wydarzenia naukowe, które
        przyciągały naukowców z całego kraju i zagranicy.</p>

    <p>Dziś nasza biblioteka naukowa jest w pełni zintegrowana z uniwersytetem, oferując najnowsze technologie i
        narzędzia edukacyjne dla studentów i pracowników naukowych. Mimo swojego bogatego dziedzictwa i tradycji,
        biblioteka stale się rozwija i dostosowuje do potrzeb użytkowników, aby zapewnić najwyższą jakość swoich usług i
        zasobów.</p>



    <h2>Wydarzenia w naszej bibliotece</h2>

    <img src="https://cdn.pixabay.com/photo/2017/11/24/10/43/ticket-2974645__340.jpg" alt="zdjęcie " width="500"
        height="410" style="float: left;">
    <p>Nasza biblioteka naukowa to nie tylko zasoby naukowe, ale również miejsce organizowania wydarzeń naukowych dla
        naszych użytkowników. W ciągu roku organizujemy wiele różnych wydarzeń, takich jak konferencje, seminaria,
        wystawy i spotkania naukowe. Oto kilka naszych najbliższych wydarzeń:</p>
    <p>Konferencja naukowa - "Nowe trendy w badaniach biomedycznych"
        Data: 15-17 kwietnia 2023
        Opis: Konferencja skupiająca się na najnowszych badaniach w dziedzinie biomedycyny. W programie m.in. wykłady i
        panele dyskusyjne prowadzone przez wybitnych naukowców z kraju i zagranicy.</p>

    <p>Wystawa naukowa - "Odkrycia XXI wieku"
        Data: 1-31 maja 2023
        Opis: Wystawa prezentująca najnowsze odkrycia naukowe i technologiczne, które miały miejsce w XXI wieku. Na
        wystawie będzie można zobaczyć m.in. modele kosmicznych sond, robotów oraz nowoczesne narzędzia laboratoryjne.
    </p>
    <p>Seminarium - "Zastosowanie sztucznej inteligencji w badaniach naukowych"
        Data: 20 maja 2023
        Opis: Seminarium poświęcone wykorzystaniu sztucznej inteligencji w badaniach naukowych. W programie m.in.
        wykłady i prezentacje przedstawiające najnowsze trendy i rozwiązania w tej dziedzinie.</p>
    <p>Spotkanie naukowe - "Odkrywajmy tajemnice kosmosu"
        Data: 10 czerwca 2023
        Opis: Spotkanie z wybitnym astronomem, podczas którego uczestnicy będą mieli okazję dowiedzieć się więcej o
        najnowszych odkryciach i badaniach kosmosu.</p>

        <footer>
            <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</p>
            <p>Adres: ul. Biblioteczna 1, 00-217 Warszawa Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>
    
        </footer>
</body>

</html>