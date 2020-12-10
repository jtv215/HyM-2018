<?php
session_start();
include 'class/modelo_usuario.php';

$nombre_Original= $_POST['id'];
$usuario = $_POST["username"];
$email = $_POST["email"];
$password = $_POST["password"];



$usu = new modelo_usuario();
$resultado = $usu->modificar_usuario_normal($usuario,$nombre_Original,$email,$password);
echo "Datos del usuario normal han sido modificado.";

?>
<a href="../index.php">cerrar</a>
