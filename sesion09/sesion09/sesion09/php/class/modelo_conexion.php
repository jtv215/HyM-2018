<?php

class conexion
{

  protected $conn;

  public function __construct()
  {
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "hmissesion09";

    // Crear conexion
    $this->conn = new mysqli($servername, $username, $password, $dbname);
    // Comprobar conexion
    
  }

}


?>
