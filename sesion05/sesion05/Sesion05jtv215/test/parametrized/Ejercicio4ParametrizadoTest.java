package parametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ual.hmis.sesion05.ejercicio4.ejercicio4;

@RunWith(Parameterized.class)
public class Ejercicio4ParametrizadoTest {
	private String p1;
	private String p2;
	private String salida;
	private ejercicio4 e4;

	public Ejercicio4ParametrizadoTest(String p1, String p2,String salida){
		this.p1=p1;
		this.p2=p2;
		this.salida=salida;
				
	}
	@Before
	public void  setUp() throws Exception{
		e4= new ejercicio4();
	}
	
	@Parameters
	public static Collection<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][]{
			{"pepe","jeff","p"},
			{"hola","ola","h"},
			{"hola","","hola"},
			{"","MESSI",""},						
		});
	}
	

	@Test
	public void testCadena() {
		assertEquals(salida, e4.cadena(p1, p2));
	}

}
