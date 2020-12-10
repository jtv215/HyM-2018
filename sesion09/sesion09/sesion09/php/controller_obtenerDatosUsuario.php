<?php

include 'class/modelo_obtenerDatosUsuario.php';

$cadena=$_SESSION["username"];
echo $cadena;
$usu = new modelo_obtenerDatosUsuario();
$resultado = $usu->usu($cadena);

?>
