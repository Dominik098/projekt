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
  	<input type="hidden" id="status" value="<%= request.getAttribute("status") %>" >
  
 
  
  
    <div class="login_form_container">
      <div class="login_form">
        <h4>Rejestracja</h4>
        <div class="input_group">
        
        <form method= "post" action="register" accept-charset="UTF-8">
		<br> <input placeholder="Imię:" type="text" name="Aimie" required class="input_text"  autocomplete="off"><br>
		<br> <input placeholder="Nazwisko:" type="text" name="Anazwisko" required class="input_text" autocomplete="off"><br>
		<br> <input placeholder="E-mail:" type="email"  name="Aemail" required class="input_text"  pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" autocomplete="off"><br>
		<br> <input placeholder="Twoje hasło:" type="password" name="Ahaslo1" required class="input_text" autocomplete="off"><br>
		
       </div> 
       
        <div class="button_group" id="login_button">
         <button><a>Zarejestruj się</a></button>
        </div>
        
        </form>
        <div class="fotter">
       
          Masz już konto to:<a href="G_login.jsp">Zaloguj się</a>
        </div>
        
     </div>
     </div>
     
     <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
	
		var staus = document.getElementById("status").value;
		if(status == "success")
		{
			swal("Gratulacje","Udało się zarejestrować","sukces");	
			
		}
	
	</script>
	
 
	
	
  </body>
</html>