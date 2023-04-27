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
                <li class="znacznik" ><a href="A_strona-gl.jsp">Strona główna</a></li>
                <li class="znacznik" ><a href="B_O bibiotece.jsp">O bibliotece</a></li>
                <li  class="znacznik"><a href="C_Kategorie książek.jsp">Kategorie książek </a></li>
                <!--   <li><a href="D_Wypożyczenia.jsp">Wypożyczane </a></li>-->
                <li class="znacznik"><a href="E_Słownik pojęć.jsp">Słownik pojęć bibliotecznych</a></li>
                <li class="znacznik"><a href="F_personel.jsp">Prersonel</a></li>
               <!-- <li class="znacznik"><a href="G_login.jsp">Logowanie</a></li>
                <li class="znacznik"><a href="H_rejestracja.jsp">Rejestracja</a></li>-->
                
                <li ><a > <%=session.getAttribute("email-login") %> </a></li>
                <li  ><a href= "logout"><button class="pobierz" >Wyloguj się</button></a></li>
                
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
			
			
			
	 <div>
   			 <h1>Formularz do wysłania pytań lub problemów napotkanych na naszej stronie </h1>
   			 
		<form class="kontakt" action="https://api.sheetmonkey.io/form/uAqJFTu2v7ZeCxUxJrE6fA" method="post">
  			
  			
  			<input placeholder="Podaj imię" type="text" name="imie"  autocomplete="off">
  			<input  type="hidden" name="email" value=" <%= session.getAttribute("email-login") %>">
  			
 			<!-- <input placeholder="podaj swój adres e-mail" type="text" name="email" required pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" autocomplete="off"> -->
  			
  			<textarea rows="5" cols="21" type="text" name="opis" required placeholder="Wpisz pytanie"></textarea>	
  			<input type="hidden" name="Created" value="x-sheetmonkey-current-date-time" ><br>
  			<input type="submit" value="Wyślij" >
		</form>
		
	</div> 




		
		
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
     
	<script type="text/javascript">
	
	$('.kontakt').submit(function() {
	
	alert("Dziękujemy za przesłanie swojej wiadomości. Skontaktujemy się z Tobą wkrótce.");

	  // zwrócenie wartości true, aby formularz mógł zostać wysłany
	  return true;
		
	});
		
		
	</script>	
			
			
        
            <p id="kom">Jeśli chodzi o pytanie do konkretnej osoby to prosimy kontaktować się przez wysłanie pytania w formularzu po wyżej, 
             tylko wtedy na początku podać konkretnego spoecjalistę.</p>

        </div>
    </div>
    <div class="footer">
        <span>(c) 2023 Biblioteka Naukowa. Wszelkie prawa zastrzeżone.</span><br>
        <span>Telefon: +48 123 456 789. E-mail: infobiblio@interia.pl</span>

    </div>

</body>

</html>