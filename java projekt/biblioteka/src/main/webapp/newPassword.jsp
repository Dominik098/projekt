<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>Snippet - BBBootstrap</title>
<link
	href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'
	rel='stylesheet'>
<link
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'
	rel='stylesheet'>
<script type='text/javascript'
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<style>
.placeicon {
	font-family: fontawesome
}

.custom-control-label::before {
	background-color: #dee2e6;
	border: #dee2e6
}
.btn{
    background-color: aqua;
    color: black;
    border-radius: 33px;
}



</style>
</head>
<body oncontextmenu='return false' class='snippet-body bg-info'>
<input type="hidden" id="status_new_failed" value="<%=request.getAttribute("status_new_failed") %>">



	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css">
	<div>
		<!-- Container containing all contents -->
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-md-9 col-lg-7 col-xl-6 mt-5">
					<!-- White Container -->
					<div class="container bg-white rounded mt-2 mb-2 px-0">
						<!-- Main Heading -->
						<div class="row justify-content-center align-items-center pt-3">
							<h1>
								<strong>Zmiana hasła</strong>
							</h1>
						</div>
						<div class="pt-3 pb-3">
							<form class="form-horizontal" action="newPassword" method="POST">
								<!-- User Name Input -->
								<div class="form-group row justify-content-center px-3">
									<div class="col-9 px-0">
										<input type="password" name="password" minlength="8" pattern="^(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"
										 placeholder="&#xf084; &nbsp; Nowe hasło" title="Hasło musi mieć minimum 8 znaków, zawierać wielką literę oraz znak specjalny."
											class="form-control border-info placeicon">
									</div>
								</div>
								<!-- Password Input -->
								<div class="form-group row justify-content-center px-3">
									<div class="col-9 px-0">
										<input type="password" name="confPassword" minlength="8" pattern="^(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"
											placeholder="&#xf084; &nbsp; Powtórz hasło" title="Hasło musi mieć minimum 8 znaków, zawierać wielką literę oraz znak specjalny."
											class="form-control border-info placeicon">
									</div>
								</div>
							
								<!-- Log in Button -->
								<div class="form-group row justify-content-center">
									<div class="col-3 px-3 mt-3">
										<input type="submit" value="Zmień"
											class="btn btn-block btn-info">
									</div>
								</div>
							</form>
						</div>
						<!-- Alternative Login -->
						<div class="mx-0 px-0 bg-light">
							
							<!-- Horizontal Line -->
							<div class="px-4 pt-5">
								<hr>
							</div>
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type='text/javascript'
		src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>
	
	
	 <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script type="text/javascript">
	
		
        
        
        var status_new_failed = document.getElementById("status_new_failed").value;
        if( status_new_failed == "resetFailed")
        {

            swal("Błąd zmiany hasła","Nie udało się zmienić hasła.","error");
            document.getElementById("status_new_failed").value="";

        }

        
	
	</script>
	
	
	
</body>
</html>