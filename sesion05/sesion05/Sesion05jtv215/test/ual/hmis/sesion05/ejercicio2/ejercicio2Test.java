package ual.hmis.sesion05.ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;



public class ejercicio2Test {
	@Test
	public void testNoEstaVacioLasDosPalabras() {		
		//Es false cuando las dos palabras es distinto de vacio y no coince la base de datos
		//1.Arrage
		String user= "hola";
		String pass= "hola";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	@Test
	public void testEstaVacioLasDosPalabras() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "";
		String pass= "";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}

	@Test
	public void testEstaVacioUsuarioPalabras() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "";
		String pass= "Hola";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	@Test
	public void testEstaVacioContrasenaPalabras() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "Hola";
		String pass= "";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	@Test
	public void testLongitudMenor30() {		
		//Es false cuando es menor de 30 y el usuario y la contraseña no es la misma que 
		//que la base de datos
		//1.Arrage
		String user= "12345";
		String pass= "12345";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	
	
	@Test	
	public void testLongitudMayor30() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "1234567891234567891234567891234554545";
		String pass= "1234567891234567891234567891234554545";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	
	@Test	
	public void testLongitudMayor30User() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "1234567891234567891234567891234554545";
		String pass= "1234567891";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	@Test	
	public void testLongitudMayor30Ucontrasena() {		
		//Es true cuando las dos palabras es distinto de vacio
		//1.Arrage
		String user= "123456789125";
		String pass= "1234567891234567891234567891234554545";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
	@Test	
	
	public void testComprobarLoginCorrecto() {		
		//Es true cuando login y pass es correcto
		//1.Arrage
		String user= "user";
		String pass= "pass";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(true, resultado);
	}
	@Test	
	public void testComprobarLoginErroneo() {		
		//Es true cuando login y pass es incorrecto
		//1.Arrage
		String user= "user";
		String pass= "mal";
		ejercicio2 e= new ejercicio2();		
		//2.Act
		boolean resultado= e.login(user, pass);
		//3.Assert
		assertEquals(false, resultado);
	}
}
