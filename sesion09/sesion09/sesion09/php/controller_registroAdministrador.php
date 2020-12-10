<?php
include 'class/modelo_registro.php';
$user = $_POST['username'];
$email = $_POST['email'];
$pass = $_POST['password'];
$activo= 1;

$anio = date("y");
$mes = date("m");
$dia = date("d");

$fecha_actual = $anio."-".$mes."-".$dia;
$id_tipo= 1;

$modelo_registro = new modelo_registro();


$resultado = $modelo_registro->comprobar_usuario($user);
if($resultado==0){
  echo "El usuario ya existe";
}else{
  $modelo_registro->crear_usuario_admin($user,$email,$pass,$activo,$fecha_actual,$id_tipo);
  echo "El usuario ha sido creado por el administrador";
}

?>
	<a href="../diseno/home_administrador.php" target="_self">Volver</a>
