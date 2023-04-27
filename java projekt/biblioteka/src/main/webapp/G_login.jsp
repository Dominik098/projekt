<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="pl">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Logowanie do Bibioteki</title>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="login.js"></script>

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />

  <link rel="stylesheet" href="G_login.css" />
</head>

<body>


  	<input type="hidden" id="status" value="<%= request.getAttribute("status") %>" >
  	
  	<input type="hidden" id="status_rej" value="<%= request.getAttribute("status_rej") %>" >
  	
  	<input type="hidden" id="status_new" value="<%=request.getAttribute("status_new") %>">


  <div class="login_form_container">
    <div class="login_form">
      <h2>Logowanie</h2>
      
   <form method= "post" action="login" >
      <div class="input_group">
        <i class="fa fa-user"></i>
        <input type="email" placeholder="E-mail" required name="email-login" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" class="input_text" autocomplete="off" required />
      </div>
      <div class="input_group">
        <i class="fa fa-unlock-alt"></i>
        <input type="password" placeholder="Hasło" required name="haslo-login" class="input_text" autocomplete="off" required />
      </div>
      <div class="button_group" id="login_button">
        <button><a>Zaloguj się</a></button>
      </div>
      
  </form>
      <div class="fotter">
        <a>Jeśli nie masz konta to:</a>
        <a href="H_rejestracja.jsp"><button class="klik" >Zarejsestruj sie</button></a>
        
      </div>
      <p>Jeśli nie pamiętasz hasła to: <a href="forgotPassword.jsp"><button class="pobierz">Przejdź tutaj</button></a></p>
      
  </div>

</div>










     <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
	
		var status = document.getElementById("status").value;
		if(status == "failed")
		{
			swal("Błąd","Nie udało się zalogować, nie poprawny e-mail lub hasło","error");	
			document.getElementById("status").value="";
		}
		
		var status_success_rej = document.getElementById("status_rej").value;
        if(status_success_rej == "success_rej")
        {
            swal("Tak jest!!!","Udało się zarejestrować. Teraz możesz się zalogować.","success");
            document.getElementById("status_rej").value="";

        }
        
        
        var status_new_failed = document.getElementById("status_new").value;
        if( status_new_failed == "resetFailed")
        {

            swal("Błąd zmiany hasła","Nie udało się zmienić hasła","error");
            document.getElementById("status_new").value="";

        }

        var status_new_success = document.getElementById("status_new").value;
        if(status_new_success == "resetSuccess")
        {

            swal("Udało się","Zmiana hasła przebiegła pomyślnie","success");
            document.getElementById("status_new").value="";

        }
	
	</script>
</body>

</html>