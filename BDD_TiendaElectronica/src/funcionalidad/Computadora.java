package funcionalidad;

import entidades.Camara;
import entidades.Microfono;
import entidades.Monitor;
import entidades.Raton;

public class Computadora {

	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Raton roton;
	private Microfono microfono;
	private Camara camara;
	private static int contadorCoputadora;
	
	private Computadora() {
		this.idComputadora = ++Computadora.contadorCoputadora;
	}
	
	public Computadora(String nombre,Monitor monitor,Raton roton,Microfono microfono,Camara camara) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.roton = roton;
		this.microfono = microfono;
		this.camara = camara;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Raton getRoton() {
		return roton;
	}

	public void setRoton(Raton roton) {
		this.roton = roton;
	}

	public Microfono getMicrofono() {
		return microfono;
	}

	public void setMicrofono(Microfono microfono) {
		this.microfono = microfono;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public int getIdComputadora() {
		return idComputadora;
	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + "\n, monitor=" + monitor
				+ "\n, roton=" + roton + "\n, microfono=" + microfono + "\n, camara=" + camara + "]\n";
	}
	
	
}
