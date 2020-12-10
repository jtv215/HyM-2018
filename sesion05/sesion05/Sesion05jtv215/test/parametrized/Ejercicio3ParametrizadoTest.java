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
@RunWith(Parameterized.class)
public class Ejercicio3ParametrizadoTest {
	private int numero;
	private String salida;
	private ejercicio3 e3;
	
	public Ejercicio3ParametrizadoTest(int numero, String resultado){
		this.numero=numero;
		this.salida=resultado;			
	}
	
	@Before
	public void  setUp() throws Exception{
		e3= new ejercicio3();
	}
		
	@Parameters
	public static Collection<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][]{
			{5,"*****"},
			{0,""},
			{-1,"numero erroneo"},
			
		});
	}
	

	@Test
	public void testCadena() {
		assertEquals(salida, e3.cadena(numero));
	}

}
