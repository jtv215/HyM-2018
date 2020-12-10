package ual.hmis.asignatura;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CalcularNotaTest {
	
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

	@Test
	public void calcularNotaActividadInexistenteDevuelve0() {
		double actual = alumno.calcularNotaActividad("noexiste");
		assertEquals(0, actual,0);
	}
	
	@Test
	public void calcularNotaActividadSinEjerciciosDevuelve0() {
		double actual = alumno.calcularNotaActividad("actividad3");
		assertEquals(0, actual, 0);
	}
	
	@Test
	public void calcularNotaActividadPiano1Devuelve5() {
		double actual = alumno.calcularNotaActividad("actividad1");
		assertEquals(15, actual, 0);
	}
	
	@Test
	public void calcularNotaActividadPiano1NotaActualizada() {
		alumno.calcularNotaActividad("actividad1");
		double actual = a1.getPuntuacionTotal();
		assertEquals(15, actual, 0);
	}
	
	@Test
	public void calcularNotaActividadPiano2Devuelve40() {
		double actual = alumno.calcularNotaActividad("actividad2");
		assertEquals(40, actual, 0);
	}
	
	@Test
	public void calcularNotaActividadPiano2NotaActualizada() {
		alumno.calcularNotaActividad("actividad2");
		double actual = a2.getPuntuacionTotal();
		assertEquals(40, actual, 0);
	}
	
}
