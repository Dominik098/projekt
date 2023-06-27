<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge" >
    <meta name="viewport" content="width=device-width, initial-scale=1.0" >
    <title>Rejestracja do Bibioteki</title>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="login.js"></script>
	
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" >

    <link rel="stylesheet" href="H_rejestracja.css"  type="text/css" >
    
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
  </head>
  <body>
  
  
  			<input type="hidden" id="status_rej" value="<%= request.getAttribute("status_rej") %>" >
  

  
  
  
    <div class="login_form_container">
      <div class="login_form">
        <h4>Rejestracja</h4>
        <div class="input_group">
        
       
        
        <form method= "post" action="register" accept-charset="UTF-8">
		<br> <input placeholder="Imię:" type="text" name="Aimie" required class="input_text"  autocomplete="off"><br>
		<br> <input placeholder="Nazwisko:" type="text" name="Anazwisko" required class="input_text" autocomplete="off"><br>
		<br> <input placeholder="E-mail:" type="email"  name="Aemail" required class="input_text"  pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" autocomplete="off"><br>
		<br> <input placeholder="Twoje hasło: " type="password" name="Ahaslo1" required class="input_text" minlength="8" pattern="^(?=.*[A-Z])(?=.*[@#$%^&+=]).*$" autocomplete="off"  title="Hasło musi mieć minimum 8 znaków, zawierać wielką literę oraz znak specjalny."><br>
			 
        
       </div> 
       
        <div class="button_group" id="login_button">
         <button><a>Zarejestruj się</a></button>
        </div>
        
        </form>
        <div class="fotter">
       
          Masz już konto to:<a href="G_login.jsp"><button class="klik" >Zaloguj się</button></a>
        </div>
        
     </div>
     </div>
     
     
     <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
     
	<script type="text/javascript">
	
	
		var status = document.getElementById("status_rej").value;
		if(status == "failed_rej")
		{
			swal("Błąd", "Nie udało się zarejestrować, użytkownik o takim e-mailu istnieje", "error");	
			document.getElementById("status_rej").value="";
		}
		
		
		
		
	</script>
	
 
  </body>
</html>