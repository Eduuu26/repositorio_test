package Alumnos;

public class Asignatura {
	private String nombre;
	private String nota;
	
	

	//Constructor
	
	
	public Asignatura(String nombre, String nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	//Getters and Setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNota() {
		return nota;
	}



	public void setNota(String nota) {
		this.nota = nota;
	}	
	

	
}
