<?php
include 'class/modelo_usuario.php';

$nombre_Original= $_POST['id'];
$usuario = $_POST["username"];
$email = $_POST["email"];
$password = $_POST["password"];
$tipo= $_POST["tipo"];
$activo=$_POST["activo"];

$insertar = new modelo_usuario();
$insertar->modificar_usuario($usuario,$nombre_Original,$email,$password,$tipo,$activo);

echo "Datos del usuario han sido modificado.";

?>
<a href="../diseno/home_administrador.php">Volver atrás</a>
