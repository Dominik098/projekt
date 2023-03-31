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
  <div class="login_form_container">
    <div class="login_form">
      <h2>Logowanie</h2>
      
   <form method= "post" action="login">
      <div class="input_group">
        <i class="fa fa-user"></i>
        <input type="email" placeholder="E-mail" required name="email-login" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" class="input_text" autocomplete="off" required />
      </div>
      <div class="input_group">
        <i class="fa fa-unlock-alt"></i>
        <input type="password" placeholder="Haslo" required name="haslo-login" class="input_text" autocomplete="off" required />
      </div>
      <div class="button_group" id="login_button">
        <button><a>Zaloguj się</a></button>
      </div>
      
  </form>
      <div class="fotter">
        <a>Zapomiales hasla?</a>
        <a href="H_rejestracja.jsp">Zarejsestruj sie</a>
      </div>
  </div>

</div>
</body>

</html>