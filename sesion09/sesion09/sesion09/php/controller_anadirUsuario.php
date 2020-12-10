<?php
session_start();
if(!isset($_SESSION["id"]) || $_SESSION["id"]==null){
	print "<script>alert(\"Acceso invalido!\");window.location='login.php';</script>";
}
?>

<html>
	<head>
		<title>.: HOME Administrador:.</title>
		<link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
	</head>
	<body>
	<?php include "/navbarLogin.php"; ?>
<div class="container">
<div class="row">
<div class="col-md-6">
	<h3> Añadir Usuario </h3>
<form role="form" name="registro" action="../controller_registroAdministrador.php" method="post">
		<div class="form-group">
			<label for="username">Nombre de usuario</label>
			<input type="text" class="form-control" id="username" name="username" placeholder="Nombre de usuario">
		</div>

		<div class="form-group">
			<label for="email">Correo Electronico</label>
			<input type="email" class="form-control" id="email" name="email" placeholder="Correo Electronico">
		</div>

		<div class="form-group">
			<label for="password">Contrase&ntilde;a</label>
			<input type="password" class="form-control" id="password" name="password" placeholder="Contrase&ntilde;a">
		</div>



		<button type="submit" class="btn btn-default">Registrar</button>
		</form>
		<a href="../../diseno/home_administrador.php" target="_self">Volver</a>
		</div>
		</div>
		</div>

		<script src="js/valida_registro.js"></script>
	</body>
</html>
