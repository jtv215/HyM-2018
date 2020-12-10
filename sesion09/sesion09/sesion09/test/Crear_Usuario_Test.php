<?php
use PHPUnit\Framework\TestCase;
require_once "php/class/modelo_registro.php";
require_once "php/class/modelo_eliminar_usuario.php";



final class Crear_Usuario_Test extends TestCase
{
	private $iniciar;
/**
* @before
*/
public function inicializar(){
   $this->iniciar=new modelo_registro();
}
/**
* @test
*/
public function test_crear_nuevo_usuario_no_admin(){
  $username = "nuevo";
  $email = "nuevo@gmail.com";
  $password = "ema";
  $activo="1";
  $fecha = "2018-06-02";
  $tipo="1";
  $resultado = $this->iniciar->crear_usuario($username,$email,$password,$activo,$fecha,$tipo);

  $resultado = $this->iniciar->comprobar_usuario($username);

  $this->assertEquals(0,$resultado);

  $this->iniciar=new modelo_eliminar_usuario();
  $resultado = $this->iniciar->eliminar_usuario($username);

}
/**
* @test
*/
public function crear_nuevo_usuario_admin(){
  $username = "nuevoAdmin";
  $email = "nuevoAdmin@gmail.com";
  $password = "ema";
  $resultado = $this->iniciar->crear_usuario_admin($username,$password,$email);
  $resultado = $this->iniciar->comprobar_usuario($username);

  $this->assertEquals(0,$resultado);

  $this->iniciar=new modelo_eliminar_usuario();
  $resultado = $this->iniciar->eliminar_usuario($username);

}



}
