package pa;

public class Reservas {
	
	private int codigoReserva;
	private int codigoVehiculo;
	private String fecha;
	private String destino;
	private int kilometros;
	private int codigoEmpleado;
	
	public Reservas(int codigoVehiculo, String fecha, String destino, int kilometros, int codigoEmpleado) {
		this.codigoVehiculo = codigoVehiculo;
		this.fecha = fecha;
		this.destino = destino;
		this.kilometros = kilometros;
		this.codigoEmpleado = codigoEmpleado;
	}

	public int getCodigoVehiculo() {
		return codigoVehiculo;
	}

	public void setCodigoVehiculo(int codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public int getCodigoReserva() {
		return codigoReserva;
	}

	@Override
	public String toString() {
		return "Reservas [codigoReserva=" + codigoReserva + ", codigoVehiculo=" + codigoVehiculo + ", fecha=" + fecha
				+ ", destino=" + destino + ", kilometros=" + kilometros + ", codigoEmpleado=" + codigoEmpleado + "]";
	}

}
