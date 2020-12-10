<?php
if(!class_exists('conexion')){
  include 'modelo_conexion.php';
}
class modelo_obtenerDatosUsuario extends conexion
{
    public function usu($cadena)
    {
      $sql = "select * from usuario where username='$cadena'";
      $result = $this->conn->query($sql);

      return $result;
    }


  
}
///

?>
