<?php
use PHPUnit\Framework\TestCase;
require_once "php/class/modelo_login.php";


final class Iniciar_Sesion_Test extends TestCase
{
	private $iniciar;
/**
* @before
*/
public function inicializar(){
   $this->iniciar=new modelo_login();
}
/**
* @test
*/
public function iniciar_sesion_correcto_admin(){
  $user = "jeffer";
  $pass = "123456";
  $resultado = $this->iniciar->login($user,$pass);
  echo "$resultado";
  $this->assertEquals(2,$resultado);
}
/**
* @test
*/
public function iniciar_sesion_correcto_no_admin(){
  $user = "carmen";
  $pass = "123456";
    $resultado = $this->iniciar->login($user,$pass);
    $this->assertEquals(1,$resultado);
  }
  /**
  * @test
  */
  public function iniciar_sesion_contraseña_incorrecta(){
    $user = "carmen";
    $pass = "0";
    $resultado = $this->iniciar->login($user,$pass);
    $this->assertEquals(0,$resultado);
    }
/**
* @test
*/
public function iniciar_sesion_incorrecto(){
  $user = "holaquetal";
  $pass = "estoymuybien";
    $resultado = $this->iniciar->login($user,$pass);
    $this->assertEquals(0,$resultado);
  }

/**
* @test
*/
public function obtener_id(){
  $user = "carmen";
  $pass = "123456";
  
    $resultado = $this->iniciar->obtenerId($user,$pass);
    $this->assertEquals(13,$resultado);
  }


}
