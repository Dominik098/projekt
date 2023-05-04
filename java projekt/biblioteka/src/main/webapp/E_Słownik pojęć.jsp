<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="icon" type="image/png" href="3.png" sizes="96x96" />
    <link rel="stylesheet" href="E_styl_slownik.css" type="text/css">

    <title>Słownik Pojęć</title>
</head>

<body>
    <tr>
        <td align="center"><img src="logo.jpg" name="ksiazka" align="left" weight="90px" height="50px"></td>
    </tr>
    <h1>
        <center><u>Słownik pojęć bibliotecznych </u></center>
    </h1>
    <header>
        <nav>
             <ul>
                <li class="znacznik" ><a href="A_strona-gl.jsp">Strona główna</a></li>
                <li class="znacznik" ><a href="B_O bibiotece.jsp">O bibliotece</a></li>
                <li  class="znacznik"><a href="C_Kategorie książek.jsp">Kategorie książek </a></li>
                <!--   <li><a href="D_Wypożyczenia.jsp">Wypożyczane </a></li>-->
                <li class="znacznik"><a href="E_Słownik pojęć.jsp">Słownik pojęć bibliotecznych</a></li>
                <li class="znacznik"><a href="F_personel.jsp">Personel</a></li>
               <!-- <li class="znacznik"><a href="G_login.jsp">Logowanie</a></li>
                <li class="znacznik"><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                
                <a  > <%=session.getAttribute("email-login") %> </a>
                <li  ><a href= "logout"><button class="pobierz" >Wyloguj się</button></a></li>
                
            </ul>

        </nav>

    </header>

    <h2>"Biblioteka to skarbnica wiedzy, która otwiera drzwi do nieograniczonych możliwości poznawczych i kulturalnych."
    </h2>
    <h4>Hasła biblioteczne które warto znać: </h4>
<div class="opcje">
    <div class="col1">
        <a href="#1">
            <li>Akapit</li>
        </a>
        <a href="#2">
            <li>Akcydens</li>
        </a>
        <a href="#3">
            <li>Almanach</li>
        </a>
        <a href="#4">
            <li>Aneks</li>
        </a>
        <a href="#5">
            <li>Antykwariat</li>
        </a>
        <a href="#6">
            <li>Aparat naukowy wydawnictwa</li>
        </a>
        <a href="#7">
            <li>Artykuł </li>
        </a>
        <a href="#8">
            <li>Atlas</li>
        </a>
        <a href="#9">
            <li>Autor</li>
        </a>
        <a href="#10">
            <li>Baza danych </li>
        </a>
        <a href="#11">
            <li>Bedeker</li>
        </a>
        <a href="#12">
            <li>Beletrystyka</li>
        </a>
        <a href="#13">
            <li>Bibliofilstwo</li>
        </a>
        <a href="#14">
            <li>Bibliografia</li>
        </a>
        <a href="#15">
            <li>Bibliografia osobowa</li>
        </a>
        <a href="#16">
            <li>Bibliografia załącznikowa </li>
        </a>
        <a href="#17">
            <li>Biblioteka </li>
        </a>
        <a href="#18">
            <li>Biblioteka narodowa</li>
        </a>
        <a href="#19">
            <li>Biblioteka publiczna </li>
        </a>
    </div>
    <div class="col2">
        <a href="#20">
            <li>Biblioteka szkolna </li>
        </a>
        <a href="#21">
            <li>Czasopismo</li>
        </a>
        <a href="#22">
            <li>Czytelnia </li>
        </a>
        <a href="#23">
            <li>Dublet</li>
        </a>
        <a href="#24">
            <li>Dział czasopisma</li>
        </a>
        <a href="#25">
            <li>Ekslibris</li>
        </a>
        <a href="#26">
            <li>Encyklopedia</li>
        </a>
        <a href="#27">
            <li>Errata</li>
        </a>
        <a href="#28">
            <li>Format książki</li>
        </a>
        <a href="#29">
            <li>Gazeta</li>
        </a>
        <a href="#30">
            <li>Hasło</li>
        </a>
        <a href="#31">
            <li>Ilustracja</li>
        </a>
        <a href="#32">
            <li>Indeks </li>
        </a>
        <a href="#33">
            <li>Katalog tytułowy</li>
        </a>
        <a href="#34">
            <li>Książka</li>
        </a>
        <a href="#35">
            <li>Księgarstwo</li>
        </a>
        <a href="#36">
            <li>Magazyn</li>
        </a>
        <a href="#37">
            <li>Nakład </li>
        </a>
        <a href="#38">
            <li>Notatka</li>
        </a>
    </div>
    <div class="col3">
        <a href="#39">
            <li>Odsyłacz</li>
        </a>
        <a href="#40">
            <li>Okładka</li>
        </a>
        <a href="#41">
            <li>Opis bibliograficzny</li>
        </a>
        <a href="#42">
            <li>Papirus</li>
        </a>

        <a href="#43">
            <li>Pismo</li>
        </a>
        <a href="#44">
            <li>Prasa</li>
        </a>
        <a href="#45">
            <li>Prawo autorskie</li>
        </a>
        <a href="#46">
            <li>Pseudonim</li>
        </a>
        <a href="#47">
            <li>Publicystyka</li>
        </a>
        <a href="#48">
            <li>Rękopis</li>
        </a>
        <a href="#49">
            <li>Słowa kluczowe </li>
        </a>
        <a href="#50">
            <li>Spis treści</li>
        </a>
        <a href="#51">
            <li>Tytulatura</li>
        </a>
        <a href="#52">
            <li>Wolumen</li>
        </a>
        <a href="#53">
            <li>Wstęp</li>
        </a>
        <a href="#54">
            <li>Wydawca</li>
        </a>
        <a href="#55">
            <li>Wydawnictwo ciągłe </li>
        </a>
        <a href="#56">
            <li>Zestawienie tematyczne</li>
        </a>
        <a href="#57">
            <li>Zwój</li>
        </a>
    </div>

</div>

    
    
</div>
    

    <h3>Opis pojęć:</h3>
    <p id="1">Akapit – wcięcie przy lewym marginesie, wydzielające odrębną część całości treściowej</p>
    <p id="2">Akcydens – druk okolicznościowy, użytkowy lub informacyjny (np.: ulotka, kalendarz, instrukcja,
        program,
        formularz, bilet, karta pocztowa, prospekt) nie będący książką ani czasopismem</p>
    <p id="3">Almanach – rocznik zawierający kalendarium wzbogacone informacjami lub poradami, czasem krótkimi
        opowiadaniami
        oraz materiałami o charakterze kronikarskim lub antologia zawierająca materiały z jednej dziedziny sztuki
        lub
        nauki, których wspólną cechą jest czas powstawania</p>
    <p id="4">Aneks – dodatek, załącznik uzupełniający tekst główny</p>
    <p id="5">Antykwariat – sklep z antykami, np. dziełami sztuki, księgarnia specjalistyczna ze starymi
        publikacjami
    </p>
    <p id="6">Aparat naukowy wydawnictwa – zespół elementów wydawnictwa (publikacji naukowej) stanowiących wykazanie
        źródłowych
        materiałów cytowanych, omawianych bądź wykorzystywanych przez autora. Należą do nich przypisy, bibliografia
        załącznikowa, aneksy, odnośniki do innych tekstów.</p>
    <p id="7">Artykuł – utwór naukowy, publicystyczny, literacki, będący samodzielną częścią większych całości (np.
        czasopisma,
        wydawnictwa zbiorowego); z reguły omawia problem, wyprowadza wnioski i uogólnienia, zmierzając do
        udowodnienia
        postawionej tezy lub uzasadnienia postula tów. Rodzaje artykułów: wstępny, redakcyjny, dyskusyjny,
        polemiczny,
        okolicznościowy, popularnonaukowy.</p>
    <p id="8">Atlas – zbiór map, planszy, tablic, ilustracji, wybranych tematycznie (np. atlas Europy) i wydanych w
        postaci
        luźnego kompletu, książki drukowanej lub programu multimedialnego</p>
    <p id="9">Autor – twórca dzieła</p>
    <p id="10">Baza danych – zbiór danych wraz z oprogramowaniem umożliwiającym ich wykorzystanie, przeszukiwanie z
        uwzględnieniem różnych kryteriów</p>

    <p id="11">Bedeker – książka, przewodnik dla turystów (nazwa pochodzi od nazwiska niemieckiego wydawcy – K.
        Baedekera
        –
        który od 1836 roku publikował w wielu językach popularne przewodniki)</p>
    <p id="12">Beletrystyka –utwory literatury pięknej, głównie powieści, nowele, opowiadania</p>
    <p id="13">Bibliofilstwo – zamiłowanie do zbierania książek, kolekcjonowania rzadkich i cennych druków</p>
    <p id="14">Bibliografia –uporządkowany (np. alfabetycznie, chronologicznie) spis dokumentów dobranych według
        określonych
        kryteriów. Wyróżniamy bibliografię: adnotowaną, bieżącą, narodową, osobową, załącznikową.</p>
    <p id="15" id="top">Bibliografia osobowa – bibliografia rejestrująca utwory jednego autora lub książki o autorze
        i
        recenzje
        jego
        dzieł</p>
    <p id="16">Bibliografia załącznikowa – bibliografia będąca spisem źródeł, które autor wykorzystał przy pisaniu
        utworu, pracy
        naukowej lub które poleca czytelnikowi jako związane z tematem pracy</p>
    <p id="17">Biblioteka – instytucja powołana do gromadzenia, opracowywania, przechowywania i udostępniania
        materiałów
        bibliotecznych. Rodzaje bibliotek: publiczne, szkolne, naukowe, pedagogiczne. Pierwsze biblioteki powstawały
        od
        III w. p.n.e. w Egipcie, Chinach, Babilonii, Grecji i Rzymie. W Polsce pierwsze biblioteki katedralne
        powstały w
        XI w.; pierwsza biblioteka uniwersytecka – Biblioteka Jagielońska – została założona w XIV w.</p>
    <p id="18">Biblioteka narodowa – biblioteka odpowiedzialna za gromadzenie, opracowywanie i trwałe przechowywanie
        pełnej
        produkcji wydawniczej państwa (kraju) oraz wydawnictw zagranicznych dotyczących państwa. Biblioteka narodowa
        w
        Polsce została powołana do życia w 1928 r.</p>
    <p id="19">Biblioteka publiczna – biblioteka ogólnodostępna, posiada zbiory o charakterze uniwersalnym</p>
    <p id="20">Biblioteka szkolna – biblioteka będąca częścią szkoły; prowadzi działalność informacyjną,
        pedagogiczną i
        wychowawczą</p>
    <p id="21">Czasopismo – wydawnictwo periodyczne; tygodnik, dwutygodnik, miesięcznik, kwartalnik, półrocznik,
        rocznik. Ze
        względu na treść dzielą się na: popularnonaukowe, naukowe, społeczno-polityczne, społeczno-kulturalne,
        literackie, techniczne, itp.</p>
    <p id="22">Czytelnia – odrębne pomieszczenie lub wydzielone miejsce w bibliotece przeznaczone do korzystania z
        księgozbioru
        podręcznego na miejscu</p>
    <p id="23">Dublet – drugi albo dalszy egzemplarz książki w zbiorach bibliotecznych</p>
    <p id="24">Dział czasopisma – stała część czasopisma wyodrębniona ze względu na tematykę, źródło informacji,
        gatunek
        dziennikarski, funkcje lub adresata; z reguły wyróżniony odrębnym elementem graficznym, często także tytułem
    </p>
    <p id="25">Ekslibris – artystycznie skomponowany znak własnościowy książki z nazwiskiem i symbolicznym znakiem
        właściciela
        lub nazwą instytucji, odbity na kartce przyklejanej na wewnętrzną stronę okładki</p>
    <p id="26">Encyklopedia – wydawnictwo zawierające zbiór wiadomości ze wszystkich dziedzin wiedzy lub jednej
        dziedziny,
        uporządkowanych najczęściej alfabetycznie</p>
    <p id="27">Errata – wykaz błędów i pomyłek dostrzeżonych w trakcie druku lub bezpośrednio po jego zakończeniu,
        opublikowany
        najczęściej w postaci osobnej kartki</p>
    <p id="28"> Format książki – wysokość grzbietu książki mierzona w centymetrach</p>
    <p id="29">Gazeta – dziennik, wydawnictwo periodyczne ukazujące się co najmniej dwa razy w tygodniu, zawierające
        informacje
        o wydarzeniach aktualnych, interesujących szerokie kręgi czytelników</p>
    <p id="30">Hasło – wyraz decydujący o zaszeregowaniu treści w słowniku, encyklopedii lub katalogu przedmiotowym
    </p>
    <p id="31">Ilustracja – reprodukcja rysunku, wykresu mapy, fotografii, dzieła malarskiego itp. stanowiąca
        uzupełnienie
        tekstu</p>
    <p id="32">Indeks – wykaz terminów dołączony do wydawnictwa, zawierający hasła występujące w tekście i miejsca,
        w
        którym
        dane hasło się znajduje; ułatwia szybkie docieranie do poszukiwanych w książce informacji</p>
    <p id="33">Katalog tytułowy – zbiór kart katalogowych ułożonych alfabetycznie według tytułów dzieł</p>
    <p id="34">Książka – dokument graficzny najczęściej w postaci kodeksu, o określonej liczbie stron, zawierający
        utrwaloną
        myśl ludzką</p>
    <p id="35">Księgarstwo – dział handlu zajmujący się hurtową i detaliczną sprzedażą książek</p>
    <p id="36"> Magazyn – czasopismo, w którym istotnym elementem jest warstwa ilustracyjna. Artykuły w magazynie są
        krótkie i
        łatwe w odbiorze.</p>
    <p id="37">Nakład – liczba egzemplarzy jednego wydania opublikowanego utworu</p>
    <p id="38">Notatka – krótki tekst, uwaga, spostrzeżenie zapisane w celu zapamiętania treści; może mieć formę
        cytatu,
        planu,
        streszczenia, konspektu, wyciągu</p>
    <p id="39">Odsyłacz – zapis pomocniczy stosowany w bibliografiach, indeksach, encyklopediach, słownikach,
        prowadzący
        do
        określonego terminu</p>
    <p id="40">Okładka – zasadnicza część oprawy wydawnictwa; zabezpiecza przed zniszczeniem oraz pełni funkcję
        informacyjną i
        ozdobną</p>
    <p id="41">Opis bibliograficzny – uporządkowany według określonych zasad zespół danych o dokumencie służących do
        jego
        identyfikacji</p>
    <p id="42">Papirus – roślina rosnąca w Egipcie, z której w starożytności produkowano materiał pisarski</p>

    <p id="43">Pismo – usystematyzowany zbiór znaków symbolicznych, obrazkowych, wyrazowych, sylabowych służący do
        graficznego
        zapisywania informacji i myśli</p>
    <p id="44">Prasa – wszelkie publikacje periodyczne ukazujące się nie rzadziej niż raz do roku, a w szczególności
        gazety i
        czasopisma</p>
    <p id="45">Prawo autorskie – przepisy prawne wydane z myślą o ochronie interesów twórców</p>
    <p id="46">Pseudonim – zmyślone imię i nazwisko, przybrane np. przez pisarzy, poetów, artystów lub dziennikarzy
    </p>
    <p id="47">Publicystyka – publiczna wypowiedź na aktualne tematy społeczne, kulturalne, polityczne, naukowe;
        stanowi
        jedną z
        podstawowych form działalności dziennikarskiej</p>
    <p id="48">Rękopis – tekst napisany ręcznie; także tekst pierwotny autora</p>
    <p id="49">Słowa kluczowe – słowa wybrane jako podstawa budowy katalogu przedmiotowego</p>
    <p id="50">Spis treści – wykaz części składowych wydawnictwa; może zawierać takie elementy jak np. wstęp,
        rozdziały,
        podrozdziały, indeksy, przypisy, bibliografię załącznikową, ilustracje, tablice, mapy</p>
    <p id="51">Tytulatura – ogół danych służących do identyfikacji wydawnictwa, umieszczonych w przypadku czasopisma
        i
        gazety na
        pierwszej stronie, w przypadku książki – na karcie tytułowej i w metryce</p>
    <p id="52">Wolumen – pojedynczy oprawiony egzemplarz druku (książka)</p>
    <p id="53">Wstęp – tekst umieszczony z reguły na początku utworu; napisany przez autora, wydawcę, tłumacza lub
        inną
        osobę;
        zawiera informacje dotyczące powstawania utworu oraz jego problematyki</p>
    <p id="54">Wydawca – osoba odpowiedzialna za merytoryczne przygotowanie publikacj</p>
    <p id="55">Wydawnictwo ciągłe – wydawnictwo o nieprzewidzianym z góry zakończeniu, ukazujące się w określonych
        odstępach
        czasu – np. periodyki, wydawnictwa seryjne i zbiorowe</p>
    <p id="56">Zestawienie tematyczne – spis tematyczny, opracowanie zawierające bibliografię dokumentów na
        określony
        temat</p>
    <p id="57">Zwój – najstarsza forma książki, znana od IV tysiąclecia p.n.e.</p>

    <a href="#" title="Do góry!" id="scroll-to-top"><img
            src="https://cdn.pixabay.com/photo/2014/03/25/16/34/arrow-297439_960_720.png" alt="strzałka do góry"
            width="50px" height="50px"></a>


    <footer>
        <span>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</span><br>
        <span>Telefon: +48 123 456 789 E-mail: kontakt@bibliotekamiejska.pl.
        </span>

    </footer>



</body>

</html>