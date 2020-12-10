
<?php
//session_start();
$_SESSION['username']=$_POST['id'];
?>

<html>
	<head>
		<title>.: HOME Administrador:.</title>
		<link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
	</head>
	<body>
	<?php include "../php/navbarLogin.php"; ?>
<div class="container">
<div class="row">
<div class="col-md-6">
	<h3> Modificar Usuario </h3>
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

		<form role="form" name="modificar" action="controller_modificarEnAdmin.php" method="post">

			<div class="form-group">

				<input type="hidden" class="form-control" id="id" name="id" value="<?php echo $fila['username']; ?>">
			</div>


			<div class="form-group">

 			 <input type="hidden" class="form-control" id="username" name="username" value="<?php echo $fila['username']; ?>">
 		 </div>
		 <div class="form-group">
			 <label for="username">Nombre de usuario</label>
			 <input type="text" class="form-control" id="username" name="username" value="<?php echo $fila['username']; ?>">
		 </div>
		<div class="form-group">
				<label for="email">Correo Electronico</label>
				<input type="email" class="form-control" id="email" name="email" value="<?php echo $fila['email']; ?>">
			</div>
			<div class="form-group">
			 <label for="password">Contrase&ntilde;a</label>
			 <input type="password" class="form-control" id="password" name="password" value="<?php echo $fila['password']; ?>">
		 </div>
		 <div class="form-group">
			 <label for="tipo">Tipo Usuario</label>
			 <select class="form-control" id="tipo" name="tipo">
				 <?php
					 if($fila['id_tipo'] == 1) echo "<option value=".$fila['id_tipo'].">Normal</option>";
					 if($fila['id_tipo'] == 2) echo "<option value=".$fila['id_tipo'].">Administrador</option>";
				 ?>
			 </select>
		 </div>
		 <div class="form-group">
			 <label for="activo">Activo</label>
			 <select name="activo" class="form-control" id="activo">
				 <option value="1" selected="selected">Si</option>
				 <option value="0">No</option>
			 </select>
		 </div>
		 <button type="submit" class="btn btn-default">Modificar</button>
		</form>
		<a href="../diseno/home_administrador.php">Volver atrás</a>


</div>
</div>
</div>
	</body>
</html>
