package edu.ucjc.programacion.pec1.eduardo_lukacs;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	

	    public Alumno(String nombre, String dni) {
	        this.nombre = nombre;
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getDni() {
	        return dni;
	    }

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
	}
	

