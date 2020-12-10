package ual.hmis.sesion05.ejercicio1;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ejercicio1Test {

	@Test
	
	public void testTransformarcaso2() {
		//multiplos de 2
		//1.Arrage
		ejercicio1 e1 = new ejercicio1();
		int entrada=2;
		//2.Act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1, resultado);
	}

	@Test
	
	public void testTransformarcaso3() {
		//multiplos de 3
		//1.Arrage
		ejercicio1 e1 = new ejercicio1();
		int entrada=3;
		//2.Act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1, resultado);
	}
	@Test
	
	public void testTransformarcaso5() {		
		//multiplos de 5
		//1.Arrage
		ejercicio1 e1 = new ejercicio1();
		int entrada=5;
		//2.Act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1, resultado);
	}
	@Test	
	public void testTransformarcaso7() {		
		//multiplos ni de 2 ni de 3
		//1.Arrage
		ejercicio1 e1 = new ejercicio1();
		int entrada=7;
		//2.Act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(7, resultado);
	}
}
