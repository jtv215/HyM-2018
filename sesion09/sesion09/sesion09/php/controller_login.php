<?php
include 'class/modelo_login.php';

$user=$_POST["username"];
$pass=$_POST["password"];
$modelo_login = new modelo_login();
$resultado = $modelo_login->login($user,$pass);
$resultado1 = $modelo_login->obtenerId($user,$pass);
session_start();
$_POST["resultado"]=$resultado;
if($resultado==0)
{
	echo "login incorrecto";

}
else if($resultado==1)
{
  $_SESSION['id']=$resultado1;
  $_SESSION['username']=$user;
	header('Location: ../diseno/home_usuario_registrado.php');


}
else
{
  $_SESSION['id']=$resultado1;
  $_SESSION['username']=$user;
  header('Location: ../diseno/home_administrador.php');
}
?>
