<?php
if(!class_exists('conexion')){
  include 'modelo_conexion.php';
}
class modelo_usuario extends conexion
{

    public function modificar_usuario($usuario,$nombre_Original,$email,$password,$tipo,$activo)
    {
      $sql = "update usuario  set username = '$usuario', email= '$email',password='$password', id_tipo='$tipo' , activo='$activo' where username='$nombre_Original';";
      $result = $this->conn->query($sql);
      return $result;
    }

    public function modificar_usuario_normal($usuario,$nombre_Original,$email,$password)
    {
      $sql = "update usuario  set username = '$usuario',email='$email', password='$password' where username='$nombre_Original';";
      $result = $this->conn->query($sql);
      return $result;
    }


}


?>
