package Alumnos;

public class Alumno {
	private String nombreAlumno;
	private String apellido;
	private String [] asignaturas;
	
	//Constructores
	
	public Alumno(String nombreAlumno, String apellido, String[] asignaturas) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellido = apellido;
		this.asignaturas = asignaturas;
		
	//Getters and Setters
		
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
	

}
