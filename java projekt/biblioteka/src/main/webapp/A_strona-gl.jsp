

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
    <title>Biblioteka</title>
    <link rel="stylesheet" href="A_styl.css" type="text/css">
    <link rel="icon" type="image/png" href="3.png" sizes="96x96" >
    
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> <!-- do ikony użytkownika -->
 
    
</head>

<body>
    <img src="logo.png" alt="ksiazka" align="left" weight="90px" height="50px">
    <h1>
        <center><u> Biblioteka Publiczna </u></center>
    </h1>

    <header>
        <nav>
            <ul>
               <li class="znacznik" ><a href="A_strona-gl.jsp"><button class="pobierz" >Strona główna</button></a></li>
                <li class="znacznik" ><a href="B_O bibiotece.jsp"><button class="pobierz" >O bibliotece</button></a></li>
                <li  class="znacznik"><a href="C_Kategorie-książek.jsp"><button class="pobierz">Kategorie książek</button></a></li>
                <!--   <li><a href="D_Wypożyczenia.jsp"><button class="pobierz" >Wypożyczane </a></li>-->
                <li class="znacznik"><a href="E_Słownik pojęć.jsp"><button class="pobierz" >Słownik pojęć bibliotecznych</button></a></li>
                <li class="znacznik"><a href="F_personel.jsp"><button class="pobierz" >Personel</button></a></li>
               <!-- <li class="znacznik"><a href="G_login.jsp">Logowanie</a></li>
                <li class="znacznik"><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                
                 <li> <a > <%=session.getAttribute("administrator") %></a><li>
       
                 
                 <li><a href="info_o_koncie.jsp"><i class="fa fa-user"></i><button class="klik" > <%=session.getAttribute("email-login") %></button></a></li>
                 
                 
        
              
                <li  ><a href="#" onclick="confirmLogout()"><button class="pobierz" >Wyloguj się</button></a></li>
                
            </ul>

        </nav>

    </header>



    <tr>
        
        <td><img src="tło_log_rej.jpg" style="width:100%;"></td>
    </tr>

   

    <h1 id="cytat">"Książka to najlepszy przyjaciel człowieka, a biblioteka to świątynia jego myśli."- Cyceron</h1>
    
<h1>Gatunki książek </h1>
    

    <div class="gallery">
       
      <div class="image-container">
        <h4>Fantastyka</h4>
        <img src="https://cdn.pixabay.com/photo/2017/09/15/16/51/fantasy-2752798__340.jpg" alt="książka">
        <div class="image-description">
          Fantastyka to gatunek, który opowiada o światach i wydarzeniach,<br> których nie ma w rzeczywistości,<br> często łączy elementy magii i mitologii.
        </div>
        
      </div>
      
      
      <div class="image-container">
        <h4>Science Fiction</h4>
        <img src="https://cdn.pixabay.com/photo/2023/02/23/18/42/space-7809436__340.jpg" alt="książka">
        <div class="image-description">
          Science fiction skupia się na opisywaniu alternatywnych wersji rzeczywistości,<br> często w oparciu o naukę i technologię,<br> z wykorzystaniem postaci z przyszłości lub obcych cywilizacji.
        </div>
        
      </div>

      <div class="image-container">
        <h4>Powieść historyczna</h4>
        <img src="https://cdn.pixabay.com/photo/2020/01/17/13/46/museum-4773011__340.jpg" alt="książka">
        <div class="image-description">
          Powieść historyczna to gatunek,<br> który opisuje wydarzenia i postaci z przeszłości, <br>starając się przedstawić je w sposób autentyczny,<br> zgodny z faktami historycznymi. 
    
          </div>
          
      </div>


<div class="image-container" >
    <h4>Romans</h4>
			<img src="https://cdn.pixabay.com/photo/2018/01/05/22/48/couple-3064048__340.jpg" alt="książka"  >
			
			<div class="image-description">
			
				Romans skupia się na związkach międzyludzkich,<br> a często również na emocjonalnych aspektach miłości,<br> namiętności, zdrady i przebaczenia.
			</div>
			
		</div>
		
		<div class="image-container" >
            <h4>Kryminał i thriller</h4>
			<img src="https://cdn.pixabay.com/photo/2014/04/05/11/40/knife-316655__340.jpg" alt="książka" >
			
			<div class="image-description">
				Kryminał i thriller to gatunki,<br> które skupiają się na śledztwach i intrygach kryminalnych,<br> a także na napięciu i niebezpieczeństwie,<br> które towarzyszą rozwojowi fabuły.
			</div>
			 
		</div>
		
		<div class="image-container" >
            <h4>Powieść młodzieżowa</h4>
			<img src="https://cdn.pixabay.com/photo/2018/10/21/10/02/social-media-3762538__340.jpg"  alt="książka"  >
			
			<div class="image-description">
				Powieść młodzieżowa opowiada o młodych bohaterach,<br> którzy przeżywają różne przygody i wyzwania,<br> często związane z dojrzewaniem, pierwszą miłością i odkrywaniem swojej tożsamości.
			</div>
			
		</div>
		
		<div class="image-container"  >
            <h4>Literatura dziecięca</h4>
			<img src="https://cdn.pixabay.com/photo/2020/06/16/14/39/mouse-5305880__340.jpg" alt="książka"  >
			
			<div class="image-description">
				Literatura dziecięca skupia się na<br> opowieściach dla najmłodszych czytelników,<br> zwykle z prostymi fabułami i jasnymi morałami.
			</div>
			
		</div>
		
		<div class="image-container" >
            <h4>Biografia i reportaż</h4>
			<img src="https://cdn.pixabay.com/photo/2012/11/20/06/08/black-66675__340.jpg" alt="książka"  >
			 
			<div class="image-description">
				Biografia i reportaż to gatunki,<br> które opisują rzeczywiste życie i doświadczenia ludzi,<br> często sławnych postaci lub zwykłych ludzi,<br> którzy przeszli przez trudne okresy w swoim życiu.
			</div>
			
        
		</div>
		
		<div class="image-container" >
            <h4>Literatura obyczajowa</h4>
			<img src="https://cdn.pixabay.com/photo/2016/05/28/07/05/book-1421097__340.jpg" alt="książka" >
			 
			<div class="image-description">
				Literatura obyczajowa skupia się na<br> opisie codziennych spraw i relacji,<br> zwykle koncentrując się na moralności i wartościach.
			</div>
			
		</div>
		
		<div class="image-container"  >
            <h4>Horror</h4>
			<img src="https://cdn.pixabay.com/photo/2017/10/13/14/15/fantasy-2847724__340.jpg" alt="książka" >
			
			<div class="image-description">
				Horror to gatunek,<br> który skupia się na strachu, grozie i przerażeniu, <br>zwykle związanych z nadprzyrodzonymi zjawiskami lub niebezpieczeństwami,<br> które czekają na bohaterów.
			</div>
			
		</div>
		
     </div>  
        

    
    <!-------------NOWOÅCI-------------------->




    <h1>Nowości w naszej bibliotece</h1>
 

       <div class="nowosci">
            <div class="image-container"  >
                <h4>Piędziesiąt Twarzy Forkisa</h4>
			<img src="https://files.legimi.com/images/e2fcee1ef2ef6dd22abc5eb50f441961/w200_u90.jpg" alt="książka" >
			
			<div class="image-description">
				Krótkie opowiadanie z podgatunku fantastyki soft vore, powstałe na podstawie zagranicznego komiksu i fan fiction. 
				Alternatywna historia wydarzeń na niebezpiecznej planecie Aj z powieści "Onkalot", 
				gdzie Forkis i Anna rozbili się podczas bitwy kosmicznej.
				 Jak sam współautor wskazuje we wstępie, tekst należy traktować z przymrużeniem oka i jako parodię.
			</div>
			
			</div>
            
                
                
            <div class="image-container"  >
                <h4>Nawia - W Świecie Dusz</h4>
			<img src="https://files.legimi.com/images/2fde278bc3238eb9ca41b6baf1be6094/w200_u90.jpg" alt="książka" >
			
			<div class="image-description">
				Motywem przewodnim jest duchowość, podróże astralne i reinkarnacja. Historia poruszająca te kwestie mówi
				 o wyzwaniach związanych z rozpoczynaniem dorosłego życia, trudnej miłości,
				 radzeniu sobie ze stratą bliskich, a także o skomplikowanym odnajdywaniu własnej drogi duchowej.
			</div>
			 
			</div>
            
  	<div class="image-container"  >
        <h4>Mieszkanie przy ulicy Ryden i inne opowiadania</h4>
			<img src="https://files.legimi.com/images/cbc4e702240d4c0869c5a0a73c7fd7ec/w200_u90.jpg" alt="książka" >
			
			<div class="image-description">
				Na co dzień spotykamy się z sytuacjami, które nie do końca potrafimy pojąć rozumem. Nazywamy je tajemnicami.
				 Często skrywamy je tylko dla siebie i po pewnym czasie tracimy rozróżnienie, 
				czy przydarzyły się nam naprawdę, czy też tylko się nam przyśniły.
			</div>
			  
			</div>
            
               
               
            <div class="image-container"  >
                <h4>Bez planu B </h4>
			<img src="https://s.lubimyczytac.pl/upload/books/5053000/5053027/1055874-352x500.jpg"  alt="książka" >
			
			<div class="image-description">
			Podczas swojej wędrówki przypadkiem dowiaduje się, że w Gerrardsville w Kolorado można obejrzeć wystawę 
			uzbrojenia z okresu wojny secesyjnej.
			 A że znajduje się niedaleko, postanawia odwiedzić miasteczko. I jak to zwykle u niego bywa, już pierwszego 
			 dnia dzieje się coś, co sprawia, że szybko tego miejsca nie opuści.
				
			</div>
			  
			</div>

             <div class="image-container"  >
                <h4>Katrusia. Opowieść o dziewczynce, <br> której moc płyneła prosto z serca</h4>
			<img src="https://files.legimi.com/images/7bcdfb0db2110b25c569f78d91af3a31/w200_u90.jpg" alt="książka" >
			
			<div class="image-description">
				Najważniejsza w tym wszystkim jest Katrusia. To jej pogodne serce sprawiło, że powstała cała ta historia.
				 Potem doszły jeszcze pozostałe materiały edukacyjne, które pozwalają pełniej zrozumieć jej losy.
				  Bohaterką opowieści jest dziewczynka, która musiała opuścić swój rodzinny dom i udać się w
				   daleką i niebezpieczną podróż w poszukiwaniu swojego nowego miejsca na ziemi.
			</div>
			  
			</div>
                
               
           <div class="image-container"  >
            <h4>Kult</h4>
			<img src="https://s.lubimyczytac.pl/upload/books/5059000/5059617/1054418-352x500.jpg" alt="książka" >
			<div class="image-description">
				Fabuła „Kultu” opowiada o porwaniu pięcioletniego Ossiana w sztokholmskiej dzielnicy Sodermalm.
				Lackberg i Fexeus udowadniają ponownie, że są fantastycznym duetem. 
				Oparta na wiedzy i doświadczeniu mentalisty oraz umiejętnościach pisarki opowieść zachwyca złożonością oraz
				 niesamowitym, zapierającym dech w piersiach klimatem.
			</div>
			 
			</div>
            
                 <div class="image-container"  >
                    <h4>Mediare. Mediacje rówjeśnicze</h4>
			<img src="https://files.legimi.com/images/88eebf78f981b6d28573f5ffcbc6d34c/w200_u90.jpg"  alt="książka" >
			<div class="image-description">
				"Mediare. Mediacje rówieśnicze" to książka autorstwa Adama Szeli, która opisuje metodę rozwiązywania 
				konfliktów między rówieśnikami za pomocą mediacji. Mediacje rówieśnicze polegają na tym, że równorzędni 
				uczniowie pomagają innym uczniom w rozwiązaniu problemów i konfliktów między nimi, 
				zamiast polegać wyłącznie na interwencji dorosłych.
			</div>
			
			</div>
			
			
            </div>
               
        
        
        
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<script>
    function confirmLogout() {
        swal({
            title: "Czy na pewno chcesz się wylogować?",
            icon: "warning",
            buttons: ["Anuluj", "Wyloguj się"],
            dangerMode: true,
        }).then((willLogout) => {
            if (willLogout) {
                window.location.href = "logout";
            }
        });
    }
</script>


        <script>
        
		const imageContainers = document.querySelectorAll('.image-container');

		imageContainers.forEach((container) => {
			const image = container.querySelector('img');
			const description = container.querySelector('.image-description');

			container.addEventListener('mouseover', () => {
				description.style.display = 'block';
			});

			container.addEventListener('mouseout', () => {
				description.style.display = 'none';
			});
		});
	</script>

 
     

 

    <footer>
        <p>(c) 2023 Biblioteka  Publiczna. Wszelkie prawa zastrzeeżone.</p>
        <p>Telefon: +48 123 456 789  E-mail: kontakt@bibliotekamiejska.pl.</p>

    </footer>

</body>

</html>