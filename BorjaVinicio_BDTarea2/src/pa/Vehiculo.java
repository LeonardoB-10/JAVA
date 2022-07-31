package pa;

public class Vehiculo {
	
	private int codigoVehiculo;
	private String descripcion;
	
	public Vehiculo(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigoVehiculo() {
		return codigoVehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [codigoVehiculo=" + codigoVehiculo + ", descripcion=" + descripcion + "]";
	}

}
