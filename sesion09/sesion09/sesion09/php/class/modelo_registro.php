<?php
if(!class_exists('conexion')){
  include 'modelo_conexion.php';
}
class modelo_registro extends conexion
{


    public function crear_usuario($user,$email,$pass,$activo,$fecha_actual,$tipo)
    {
      $sql = "insert into usuario (username,email,password,activo,fechaCreacion,fechaUltimoAcceso,id_tipo) values ('$user','$email','$pass','$activo','$fecha_actual','$fecha_actual','$tipo')";
      $result = $this->conn->query($sql);

    }


    public function crear_usuario_admin($user,$pass,$email)
    {
      $sql = "insert into usuario (username,email,password) values ('$user','$email','$pass')";
      $result = $this->conn->query($sql);
    }
    //ok
    public function comprobar_usuario($user){
      $sql = "select * from usuario where username='$user'";
      $result = $this->conn->query($sql);
      while($usuario = $result->fetch_assoc())
      {
        return 0;
      }
      return 1;
    }
    }


?>
