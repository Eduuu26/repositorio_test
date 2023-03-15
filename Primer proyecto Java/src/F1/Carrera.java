package F1;

public class Carrera {
	private String nombre;
	private String circuito;
	private String parrillaSalida;
	private String distancia;
	public Carrera(String nombre, String circuito, String parrillaSalida, String distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrillaSalida = parrillaSalida;
		this.distancia = distancia;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public String getParrillaSalida() {
		return parrillaSalida;
	}
	public void setParrillaSalida(String parrillaSalida) {
		this.parrillaSalida = parrillaSalida;
	}
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	

}
