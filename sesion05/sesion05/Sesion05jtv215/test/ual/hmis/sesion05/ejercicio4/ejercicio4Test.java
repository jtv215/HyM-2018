package ual.hmis.sesion05.ejercicio4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ual.hmis.sesion05.ejercicio3.ejercicio3;

public class ejercicio4Test {

	@Test	
	public void testCaracter() {		
		//Las dos variable p1 y p2 contienen nombre
		//1.Arrage
		
		ejercicio4 e= new ejercicio4();	
		String p1="pepe";
		String p2="jeff";
		
		//2.Act
		String resultado=e.cadena(p1, p2);
		//3.Assert
		assertEquals("p", resultado);
	}
	
	@Test	
	public void testCaracter2() {		
		//La variable p2 contien ola
		//1.Arrage
		
		
		ejercicio4 e= new ejercicio4();	
		String p1="hola";
		String p2="ola";
		
		//2.Act
		String resultado=e.cadena(p1, p2);
		
		//3.Assert
		assertEquals("h", resultado);
	}
	@Test	
	public void testCaracter3() {		
		//La variable p2 no contiene nada
		//1.Arrage
		
		ejercicio4 e= new ejercicio4();	
		String p1="hola";
		String p2="";
		
		//2.Act
		String resultado=e.cadena(p1, p2);
		
		//3.Assert
		assertEquals("hola", resultado);
	}
	@Test	
	public void testCaracter4() {		
		//La variable p1 esta vacia
		//1.Arrage
		
		ejercicio4 e= new ejercicio4();	
		String p1="";
		String p2="MESSI";
		
		//2.Act
		String resultado=e.cadena(p1, p2);
		
		//3.Assert
		assertEquals("", resultado);
	}
}
