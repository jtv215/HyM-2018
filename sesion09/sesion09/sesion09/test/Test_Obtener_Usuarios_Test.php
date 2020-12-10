<?php
use PHPUnit\Framework\TestCase;
require "php/class/modelo_get_usuarios.php";


final class Obtener_Usuarios_Test extends TestCase
{
	private $iniciar;
/**
* @before
*/
public function inicializar(){
   $this->iniciar=new modelo_get_usuarios();
}
/**
* @test
*/
public function devolver_usuarios(){

  $resultado = $this->iniciar->usuarios();

  $this->assertEquals(6, $resultado->num_rows);
}




}
