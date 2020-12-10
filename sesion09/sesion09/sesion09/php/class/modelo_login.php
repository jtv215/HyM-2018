<?php
if(!class_exists('conexion')){
  include 'modelo_conexion.php';
}
class modelo_login extends conexion
{
    public function login($user,$pass)
    {
      $sql = "select id,username,password,id_tipo from usuario where username='$user' and password='$pass'";
      $result = $this->conn->query($sql);
      while($usuario = $result->fetch_assoc())
      {
        if($usuario["id_tipo"]==1)
          return 1;
        else
          return 2;
      }
      return 0;
    }

    public function obtenerId($user,$pass)
    {
      $mysqli=new mysqli("localhost","root","","hmissesion09");
      $sql = "select id from usuario where username ='$user' and password='$pass'";
      $result=$mysqli->query($sql);
      $rows = $result->num_rows;
      $id;
      if($rows > 0) {
			     $row = $result->fetch_assoc();
           $id = $row['id'];

      }
      return -1;
    }
}


?>
