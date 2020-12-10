<?php
use PHPUnit\Framework\TestCase;
require_once "php/class/modelo_registro.php";
require_once "php/class/modelo_usuario.php";
require_once "php/class/modelo_ObtenerDatosUsuario.php";


final class Modificar_Usuario_Test extends TestCase
{
	private $iniciar;
/**
* @before
*/
public function inicializar(){
   $this->iniciar=new modelo_registro();
   $this->iniciar->crear_usuario("nuevo","nuevo@gmail.com","ema","1","2018-06-02","1");
   $this->iniciar=new modelo_usuario();
}

/**
* @test
*/
public function modificar_usuario(){
  $usuario = "soynadie";
  $nombre_Original = "nuevo";
  $correo = "adios@gmail.com";
  $activo = "0";
  $password = "0123456";
  $tipo="1";
  $this->iniciar->modificar_usuario($usuario,$nombre_Original,$correo,$password,$tipo,$activo);
  $this->iniciar=new modelo_obtenerDatosUsuario();
  $resultado = $this->iniciar->usu($usuario);
  $this->assertEquals("soynadie",$usuario);

}

/**
* @test
*/
public function modificar_usuario_normal(){
  $usuario = "carmen2";
  $nombre_Original = "soynadie";
  $email = "adios@gmail.com"; 
  $password = "0123456";  
  $this->iniciar->modificar_usuario_normal($usuario,$nombre_Original,$email,$password);
  $this->iniciar=new modelo_obtenerDatosUsuario();
  $resultado = $this->iniciar->usu($usuario);
  $this->assertEquals("carmen2",$resultado);

}



}
