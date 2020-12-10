<?php
include 'class/modelo_eliminar_usuario.php';
$valor =$_POST['id'];
$eliminar = new modelo_eliminar_usuario();
$resultado = $eliminar->eliminar_usuario($valor);
echo "El usuario se ha eliminado correctamente";
?>
	<a href="../diseno/home_administrador.php" target="_self">Volver</a>
