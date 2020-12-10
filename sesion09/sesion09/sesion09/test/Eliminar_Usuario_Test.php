<?php
use PHPUnit\Framework\TestCase;
require_once "php/class/modelo_registro.php";
require_once "php/class/modelo_eliminar_usuario.php";



final class Eliminar_Usuario_Test extends TestCase
{
	private $iniciar;
/**
* @before
*/
public function inicializar(){

   $this->iniciar=new modelo_eliminar_usuario();
}
/**
* @test
*/
public function eliminar_usuario(){
  //creamos un usuario para despues eliminarlo
 $insert = new modelo_registro();
 $var = $insert->crear_usuario("nuevo","nuevo@gmail.com","ema","1","2018-06-02","1");
 $res = $insert->comprobar_usuario("nuevo");
 //res tiene que ser 0 para que el usuario exista
  $this->assertEquals(0,$res);
  $resultado = $this->iniciar->eliminar_usuario("nuevo");

  $res = $insert->comprobar_usuario("nuevo");
 //res ahora tiene que ser 1 ver que no esta el objeto
  $this->assertEquals(1,$res);
}




}
