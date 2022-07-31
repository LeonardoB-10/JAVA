package pa;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Vehiculo {
	
	@Id 
	private final int codigoVehiculo;
	private static int contadorID;
	private String descripcion;
	
	public Vehiculo(String descripcion) {
		this.codigoVehiculo = ++Vehiculo.contadorID;
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
		return "\nVehiculo [codigoVehiculo=" + codigoVehiculo + ", descripcion=" + descripcion + "]";
	}

}
