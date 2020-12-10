<?php
session_start();
if(!isset($_SESSION["id"]) || $_SESSION["id"]==null){
	print "<script>alert(\"Acceso invalido!\");window.location='login.php';</script>";
}
?>

<html>
	<head>
		<title>.: HOME :.</title>
		<link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
	</head>
	<body>
	<?php include "../php/navbarLogin.php"; ?>
<div class="container">
<div class="row">
<div class="col-md-6">
		<h2> Home Usuario Normal </h2>
	<h3> Modificar Datos Personales </h3>

	<?php
	include '../php/controller_obtenerDatosUsuario.php';
	if($resultado->num_rows>0) {
	$fila = $resultado->fetch_array();
	}
	else{
	echo "NO HAY RESULTADOS";
	}
	while($row1 =$resultado -> fetch_assoc()){
	}
	?>


		<br />
		<form role="form" name="actualizar" action="../php/controller_datos_usuario_normal.php" method="post">

			<div class="form-group">
				<input type="hidden" class="form-control" id="id" name="id" value="<?php echo $fila['id']; ?>">
			</div>

			<div class="form-group">
			<label for="email">Nombre</label>
 			 <input type="hiden" class="form-control" id="username" name="username" value="<?php echo $fila['username']; ?>">
 		 </div>

			<div class="form-group">
				<label for="email">Correo Electronico</label>
				<input type="email" class="form-control" id="email" name="email" value="<?php echo $fila['email']; ?>">
			</div>

			<div class="form-group">
			 <label for="password">Contrase&ntilde;a</label>
			 <input type="password" class="form-control" id="password" name="password" value="<?php echo $fila['password']; ?>">
		 </div>
		 <button type="submit" class="btn btn-default">Modificar</button>
		</form>
</div>
</div>
</div>
	</body>
</html>
