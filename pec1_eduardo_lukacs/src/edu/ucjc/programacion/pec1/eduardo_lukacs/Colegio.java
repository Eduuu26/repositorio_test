package edu.ucjc.programacion.pec1.eduardo_lukacs;

import java.util.ArrayList;

public class Colegio {
    private String nombre;
    private String direccion;
    private ArrayList<Aula> aulas;

    public Colegio(String nombre, String direccion, ArrayList<Aula> aulas) {
        this.nombre = nombre;
        this.setDireccion(direccion);
        this.aulas = aulas;
    }

    public void asignarAsiento(Alumno alumno) {
        boolean asignado = false;
        for (Aula aula : aulas) {
            int asiento = aula.asignarAsiento(alumno);
            if (asiento != -1) {
                System.out.println("El alumno " + alumno.getNombre() + " con DNI " + alumno.getDni() + " ha sido asignado al asiento " + asiento + " del aula " + aula.getNombre());
                asignado = true;
                break;
            }
        }
        if (!asignado) {
            System.out.println("No hay sitio disponible para el alumno " + alumno.getNombre() + " con DNI " + alumno.getDni());
        }
    }

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Aula[] getAulas() {
	
		return null;
	}
}

