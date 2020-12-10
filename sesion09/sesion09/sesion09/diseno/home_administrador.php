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

		<h2>Home Administrador</h2>
<?php
		//Obtener todos los usuarios
		include '../php/controller_get_usuarios.php';
	  if($resultado->num_rows>0) {
    $fila = $resultado->fetch_array();
		}
		else{
    echo "NO HAY RESULTADOS";
		}
		echo "Bienvenido: ";
		echo $_SESSION['username'];
?>

<form method='post' action='../php/vista_anadirUsuario.php'>
 <input type='submit' value='Añadir Usuario' class='btn btn-default btn-sm'>
</form>
<h3 align="center">Lista de Usuarios</h3>
	 <table class="table table-bordered" >

	 <tr class="danger" align="center" >
			 <td>Nombre</td>
			 <td>Email</td>
			 <td>Activo</td>
			 <td>Tipo Usuario</td>
			 <td>Fecha Creación Usuario</td>
			 <td>Modificar</td>
			 <td>Eliminar</td>
	 </tr>

	 <?php

			 while($row1 =$resultado -> fetch_assoc()){
			 echo
					 "<tr>

							 <td>".$row1["username"]."</td>
							 <td>".$row1["email"]."</td>
							 <td>".$row1["activo"]."</td>
							 <td>".$row1["id_tipo"]."</td>
							 <td>".$row1["fechaCreacion"]."</td>
							 <td align='center'>
							 <form method='post' action='../php/vista_modificarUsuarioAdmin.php'>
								<input type='hidden' name='id' value='".$row1["username"]."'>
								<input type='submit' value='Editar' class='btn btn-default btn-sm'>
								</form></td>
							 </td>
							 <td align='center'>
							 <form method='post' action='../php/controller_eliminar.php'>
								<input type='hidden' name='id' value='".$row1["username"]."'>
								<input type='submit' value='Eliminar' class='btn btn-default btn-sm danger'>
								</form></td>

					 </tr>";
			 }
		?>
	 </table>
</div>
</div>
</div>

	</body>
</html>
