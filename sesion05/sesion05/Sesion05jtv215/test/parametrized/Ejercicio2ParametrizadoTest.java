package parametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import ual.hmis.sesion05.ejercicio2.ejercicio2;
@RunWith(Parameterized.class)
public class Ejercicio2ParametrizadoTest {
	private String usarne;
	private String contrasena;
	private boolean salida;	
	private ejercicio2 e2;
	
	public Ejercicio2ParametrizadoTest(String username,String contrasena,boolean resultado){
		this.usarne=username;
		this.contrasena=contrasena;	
		this.salida=resultado;	
	}
	
	@Before
	public void setUp() throws Exception {
		e2 = new ejercicio2();
	}

	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { 
			{"hola", "hola",false}, 
			{"", "",false},
			{"", "Hola",false}, 
			{"Hola", "",false}, 
			{"12345", "12345",false},
			{"1234567891234567891234567891234554545", "1234567891234567891234567891234554545",false},
			{"1234567891234567891234567891234554545", "1234567891",false},
			{"123456789125", "1234567891234567891234567891234554545",false},
			{"user", "pass",true},
			{"user", "mal",false},
		});
	}

	
	
	@Test
	public void testLogin() {
		assertEquals(salida, e2.login(usarne, contrasena));
	}

}
