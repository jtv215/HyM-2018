package parametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio1.ejercicio1;

@RunWith(Parameterized.class)
public class Ejercicio1ParametrizadoTest {
	private int salida;
	private int entrada;
	private ejercicio1 e1;

	public Ejercicio1ParametrizadoTest(Integer numero, Integer esperado) {
		this.entrada = numero;
		this.salida = esperado;
	}

	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] { 
			{2, 1}, 
			{3, 1},
			{5, 1}, 
			{7, 7},			
		});
	}

	@Before
	public void setUp() throws Exception {
		e1 = new ejercicio1();
	}
	@Test
	public void testTransformar() {
		assertEquals(salida, e1.transformar(entrada));
	}

}
