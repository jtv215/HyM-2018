package parametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio3.ejercicio3;
import ual.hmis.sesion05.ejercicio5.ejercicio5;
@RunWith(Parameterized.class)
public class Ejercicio5ParametrizadoTest {
	private String cadena;
	private String salida;
	private ejercicio5 e5;
	
	public Ejercicio5ParametrizadoTest(String cadena, String resultado){
		this.cadena=cadena;
		this.salida=resultado;			
	}
	
	@Before
	public void  setUp() throws Exception{
		e5= new ejercicio5();
	}
	
	@Parameters
	public static Collection<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][]{
			{"Mayor de edad","Error: cadena sin punto"},
			{"Menor. De edad 3","Menor."},
			{"Edad 3. años","Error: cadena con algun numero"},
			
		});
	}
	
	@Test
	public void testCadena() {
		assertEquals(salida, e5.comprobarCadena(cadena));
	}

}
