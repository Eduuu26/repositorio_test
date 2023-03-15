package F1;

public class Coche {
	private String escudería;
	private String motor;
	private int numero;
	private String piloto;
	private int velocidad;
	private int avance;
	public Coche(String escudería, String motor, int numero, String piloto, int velocidad, int avance) {
		super();
		this.escudería = escudería;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}
	public String getEscudería() {
		return escudería;
	}
	public void setEscudería(String escudería) {
		this.escudería = escudería;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getAvance() {
		return avance;
	}
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	
}
