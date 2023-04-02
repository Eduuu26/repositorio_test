package edu.ucjc.programacion.pec1.eduardo_lukacs;

import java.util.ArrayList;

class Aula {
	private int número;
	private int planta;
	private int asiento;
	
    private String nombre;
    private int capacidad;
    private ArrayList<Alumno> alumnos;

    public Aula(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.alumnos = new ArrayList<>();
    }

    public int asignarAsiento(Alumno alumno) {
        if (alumnos.size() < capacidad) {
            int asiento = alumnos.size() + 1;
            alumnos.add(alumno);
            return asiento;
        } else {
            return -1;
        }
    }

    public String getNombre() {
        return nombre;
    }

	public int getNúmero() {
		return número;
	}

	public void setNúmero(int número) {
		this.número = número;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public boolean tieneAsientosLibres() {
		return false;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
}
