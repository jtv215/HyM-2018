package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;



public class ejercicio3Test {
	
	@Test	
	public void testCadena5() {		
		//Es cuando se introduce un número positivo
		//1.Arrage
		
		ejercicio3 e= new ejercicio3();	
		int n=5;
		//2.Act
		String resultado= e.cadena(n);
		//3.Assert
		assertEquals("*****", resultado);
	}
	@Test	
	public void testCadena0() {		
		//Es "" cuando se introduce el número cero
		//1.Arrage		
		ejercicio3 e= new ejercicio3();	
		int n=0;
		//2.Act
		String resultado= e.cadena(n);
		//3.Assert
		assertEquals("", resultado);
	}
	
	@Test	
	public void testCadenamenos1() {		
		//Es "" cuando se introduce un número negativo
		//1.Arrage
		
		ejercicio3 e= new ejercicio3();	
		int n=-1;
		//2.Act
		String resultado= e.cadena(n);
		//3.Assert
		assertEquals("numero erroneo", resultado);
	}
	
}
