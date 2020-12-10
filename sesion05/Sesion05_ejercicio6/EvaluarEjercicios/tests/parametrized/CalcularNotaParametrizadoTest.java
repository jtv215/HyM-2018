package parametrized;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.asignatura.Actividad;
import ual.hmis.asignatura.Alumno;
import ual.hmis.asignatura.Ejercicio;
//import ual.hmis.sesion05.ejercicio1.ejercicio1;
//import ual.hmis.sesion05.ejercicio1.ejercicio1;

@RunWith(Parameterized.class)
public class CalcularNotaParametrizadoTest {
	
	private String nombre;
	private int Salida;
	private static double calculaNota;
	private int n;
	
	private Actividad a4;
	Alumno alumno;
	Actividad a1, a2, a3;
	
	@Before
	public void setUp() throws Exception {
		alumno = new Alumno();
		alumno.setNombre("Jefferson");
		
		a1 = new Actividad();
		a2 = new Actividad();
		a3 = new Actividad();
		
		a1.setNombre("actividad1");
		a1.setEjercicios(new ArrayList<Ejercicio>());
		a2.setNombre("actividad2");
		a2.setEjercicios(new ArrayList<Ejercicio>());
		a3.setNombre("actividad3");
		a3.setEjercicios(new ArrayList<Ejercicio>());
		
		a1.agregarEjercicioCalificado("EjercicioA", 5);
		a1.agregarEjercicioCalificado("EjercicioB", 5);
		a1.agregarEjercicioCalificado("EjercicioC", 5);
		
		
		a2.agregarEjercicioCalificado("EjercicioA", 10);
		a2.agregarEjercicioCalificado("EjercicioB", 10);
		a2.agregarEjercicioCalificado("EjercicioC", 10);
		a2.agregarEjercicioCalificado("EjercicioE", 10);
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		actividades.add(a1);
		actividades.add(a2);
		alumno.setActividadesAsignadas(actividades);	
	}

	public CalcularNotaParametrizadoTest(String nombre,int SalidaNota,double calculanota, int n) {
		this.nombre = nombre;
		this.Salida= SalidaNota;
		this.calculaNota=calculanota;
		this.n=n;
		
	}
	
	@Parameters
	public static Collection<Object[]> addedNumbers() {
		return Arrays.asList(new Object[][] { 
			{"noexiste",0,calculaNota,0}, 
			{"actividad3",0, calculaNota,0},
			{"actividad1",15, calculaNota,0}, 
			{"actividad1",15, calculaNota,0}, 
			{"actividad2",40, calculaNota,0}, 
			{"actividad2",40, calculaNota,0},
		});
	}
	
	
	@Test
	public void testCalcularNota() {
		assertEquals(Salida, alumno.calcularNotaActividad(nombre),0);
	}

	
}
