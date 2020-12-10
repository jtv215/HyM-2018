package ual.hmis.asignatura;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		int puntuacionTotal = 0;
		// Buscar la actividad
		for ( Actividad a : actividadesAsignadas) {
			if (a.getNombre().equals(nombreActividad)) {
				// Existe la actividad
				for (Ejercicio e : a.getEjercicios()) {
					// Calculamos la puntuación
					puntuacionTotal += e.getPuntuacion();
				}
				a.setPuntuacionTotal(puntuacionTotal);
				break;
			}
			// No existe esa actividad, se devolverá 0
		}
		
		return puntuacionTotal;
	}

}
