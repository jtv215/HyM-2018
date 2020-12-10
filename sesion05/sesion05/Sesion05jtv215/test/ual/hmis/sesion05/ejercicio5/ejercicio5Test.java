package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ual.hmis.sesion05.ejercicio5.ejercicio5;


public class ejercicio5Test {

	
	
	@Test	
	public void testSinPunto() {		
		//cadena sin punto.
		//1.Arrage
		
		ejercicio5 e= new ejercicio5();	
		String cadena="Mayor de edad";
		
		//2.Act
		String resultado=e.comprobarCadena(cadena);
		//3.Assert
		assertEquals("Error: cadena sin punto", resultado);
	}
	
	@Test	
	public void testConpunto() {		
		//Una cadena con un punto.
		//1.Arrage
		
		ejercicio5 e= new ejercicio5();	
		String cadena="Menor. De edad 3";
		
		//2.Act
		String resultado=e.comprobarCadena(cadena);
		//3.Assert
		assertEquals("Menor.", resultado);
	}
	
	@Test	
	public void testConpuntoyNumero() {		
		//Una cadena con un punto y número antes del punto.
		//1.Arrage
		
		ejercicio5 e= new ejercicio5();	
		String cadena="Edad 3. años";
		
		//2.Act
		String resultado=e.comprobarCadena(cadena);
		//3.Assert
		assertEquals("Error: cadena con algun numero", resultado);
	}
}
