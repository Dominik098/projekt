
<%
	if(session.getAttribute("email-login")==null){
		
		response.sendRedirect("G_login.jsp");
	}
%>


 <%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bibioteka</title>
    <link rel="stylesheet" href="A_styl.css" type="text/css">
    <link rel="icon" type="image/png" href="3.png" sizes="96x96" >
</head>

<body>
    <img src="logo.jpg" alt="ksiazka" align="left" weight="90px" height="50px">
    <h1>
        <center><u> Biblioteka Naukowa </u></center>
    </h1>

    <header>
        <nav>
            <ul>
                <li><a href="A_strona-gl.html">Strona główna</a></li>
                <li><a href="B_O bibiotece.html">O bibliotece</a></li>
                <li><a href="C_Kategorie książek.html">Kategorie książek </a></li>
                <li><a href="D_Wypożyczalnia.html">Wypożyczane </a></li>
                <li><a href="E_Słownik pojęć.html">Słownik pojęć bibliotecznych</a></li>
                <li><a href="F_personel.html">Prersonel</a></li>
                <li><a href="G_login.html">Logowanie</a></li>
                <li><a href="H_rejestracja.html">Rejestracja</a></li>
                <li><a href= "logout">Wyloguj się</a></li>
                <li><a > <%=session.getAttribute("email-login") %> </a></li>
            </ul>

        </nav>

    </header>



    <tr>
        <!-- tÅo strony gÅÃ³wnej-->
        <td><img src="https://cdn.pixabay.com/photo/2015/10/10/13/03/prague-980732__340.jpg" style="width:100%;"></td>
    </tr>

    <!-- tÅo strony gÅÃ³wnej-->

    <h1 id="cytat">Książka to najlepszy przyjaciel człowieka, a biblioteka to świątynia jego myśli.- Cyceron</h1>
    <h1>Gatunki książek </h1>

    <table>

        <tr>
            <td colspan="6" style="padding:20px 10px;"></td>
        </tr>

        <tr>
            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2017/09/15/16/51/fantasy-2752798__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Fantastyka">
                <h4>Fantastyka</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2023/02/23/18/42/space-7809436__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Science fiction">
                <h4>Science fiction</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2020/01/17/13/46/museum-4773011__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="PowieÅÄ historyczna">
                <h4>Powieść historyczna</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2018/01/05/22/48/couple-3064048__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Romans">
                <h4>Romans</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2014/04/05/11/40/knife-316655__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="KryminaÅ i thriller">
                <h4>Kryminał i thriller</h4>
            </td>
        </tr>

        <tr>
            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2018/10/21/10/02/social-media-3762538__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="PowieÅÄ mÅodzieÅ¼owa">
                <h4>Powieść młodzieżowa</h4>
            </td>


            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2020/06/16/14/39/mouse-5305880__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Literatura dzieciÄca">
                <h4>Literatura dziecięca</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2012/11/20/06/08/black-66675__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Biografia i reportaÅ¼">
                <h4>Biografia i reportaż</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2016/05/28/07/05/book-1421097__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Literatura obyczajowa">
                <h4>Literatura obyczajowa</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://cdn.pixabay.com/photo/2017/10/13/14/15/fantasy-2847724__340.jpg" alt="ksiÄÅ¼ka"
                    height="200px;" width="100%" title="Horror">
                <h4>Horror</h4>
            </td>
        </tr>
    </table>
    <!-------------NOWOÅCI-------------------->



    <h1>Nowości w naszej bibliotece</h1>
    <table>
        <tr>
            <td colspan="6" style="padding:20px 10px;"></td>
        </tr>

        <tr id="nowosci">
            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/e2fcee1ef2ef6dd22abc5eb50f441961/w200_u90.jpg" alt="ksiÄÅ¼ka"
                    height="50%" width="100%" title="PiÄÄdziesiÄt Twarzy Forkisa">
                <h4>Piędziesiąt Twarzy Forkisa</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/2fde278bc3238eb9ca41b6baf1be6094/w200_u90.jpg" height="50%"
                    width="100%" title="Nawia - W Åwiecie Dusz">
                <h4>Nawia - W Świecie Dusz</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/cbc4e702240d4c0869c5a0a73c7fd7ec/w200_u90.jpg" height="200px;"
                    width="100%" title="Mieszkanie przy ulicy Ryden i inne opowiadania">
                <h4>Mieszkanie przy ulicy Ryden i inne opowiadania</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/9d234106e9877f2136161e18dd2ad2c5/w200_u90.jpg" height="50%;"
                    width="100%" title="Tajemnica, filozofia, egzystencja">
                <h4>Tajemnica, filozofia, egzystencja </h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/7bcdfb0db2110b25c569f78d91af3a31/w200_u90.jpg" height="200;"
                    width="100%" title="Katrusia. OpowieÅÄ o dziewczynce, ktÃ³rej moc pÅynÄÅa prosto z serca">
                <h4>Katrusia. Opowieść o dziewczynce, której moc płyneła prosto z serca</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/4bcabc6b74b59ac663a2e0e7da240c32/w200_u90.jpg" height="50%;"
                    width="100%" title="Gabriel Caballero">
                <h4>Gabriel Caballero</h4>
            </td>

            <td style="padding:5px 5px;">
                <img src="https://files.legimi.com/images/88eebf78f981b6d28573f5ffcbc6d34c/w200_u90.jpg" height="50%;"
                    width="100%" title="Mediare. Mediacje rÃ³wieÅnicze">
                <h4>Mediare. Mediacje rówjeśnicze</h4>
            </td>

        </tr>
    </table>

    <div>
        <h2>Godziny otwarcia biblioteki</h2>
        <center>
            <table id="Godziny">
                <tr id="dni">
                    <td>PoniedziaÅek</td>
                    <td>Wtorek</td>
                    <td>Środa</td>
                    <td>Czwartek</td>
                    <td>PiÄtek</td>
                    <td>Sobota</td>
                    <td>Niedziela</td>
                </tr>
                <tr id="dni_godz">
                    <td>8:00 - 20:00</td>
                    <td>8:00 - 20:00</td>
                    <td>8:00 - 20:00</td>
                    <td>10:00 - 20:30</td>
                    <td>8:00 - 20:00</td>
                    <td>8:00 - 19:00</td>
                    <td style="color:red">Nieczynne</td>
                </tr>

            </table>
        </center>



    </div>

    <footer>
        <p>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeeżone.</p>
        <p>Adres: ul. Biblioteczna 1, 00-217 Warszawa Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>

    </footer>

</body>

</html>