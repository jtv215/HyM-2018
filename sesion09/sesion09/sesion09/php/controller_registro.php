
<?php
include 'class/modelo_registro.php';

$user=$_POST["username"];
$email=$_POST["email"];
$pass=$_POST["password"];
$activo ='1';
$anio = date("y");
$mes = date("m");
$dia = date("d");
$fecha_actual = $anio."-".$mes."-".$dia;
$tipo = '1';

$modelo_registro = new modelo_registro();

$resultado = $modelo_registro->comprobar_usuario($user);
if($resultado==0){
  echo "El usuario ya existe";

}else{
  $modelo_registro->crear_usuario($user,$email,$pass,$activo,$fecha_actual,$tipo);
  echo "El usaurio ha sido creado";

}

?>

































<!--


<?php
/*
			include "conexion.php";
			$username = $_POST['username'];
			$email = $_POST['email'];
			$password = $_POST['password'];
			$tipo = '1';
			$activo = $_POST['activo'];
			if($activo == 'Si'){
				$activo = 1;
			}else{
					$activo = 0;
			}
			$anio = date("y");
			$mes = date("m");
			$dia = date("d");
			$fecha_actual = $anio."-".$mes."-".$dia;

			mysqli_query($conn,"INSERT INTO usuario (username, email, password, activo, fechaCreacion, fechaUltimoAcceso, id_tipo)
			VALUES ('$username','$email','$password',$activo,'$fecha_actual','$fecha_actual',$tipo)");

			//echo $username.$email.$password.$activo.$fecha_actual.$fecha_actual.$tipo;
			echo "El Usuario $username ha Sido Registrado de Manera Satisfactoria. Ahora Puedes Iniciar Session";

			mysqli_close($conn);
			echo "<br>";
			*/
?>
	<a href="../registro.php" target="_self">Volver</a>
-->
