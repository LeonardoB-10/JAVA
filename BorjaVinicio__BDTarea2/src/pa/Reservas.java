package pa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Reservas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private final int codigoReserva;
	private static int contadorReserva;
	private String fecha;
	private String destino;
	private int kilometros;

	@OneToMany // De uno a muchos
	@JoinColumn(name = "codigoVehiculo")
	private List<Vehiculo> listaVehiculo;

	@OneToMany // De uno a muchos
	@JoinColumn(name = "codigoEmpleado")
	private List<Empleados> listaEmpleados;

	public Reservas(String fecha, String destino, int kilometros, List<Vehiculo> listaVehiculo,
			List<Empleados> listaEmpleados) {
		this.codigoReserva = ++Reservas.contadorReserva;
		this.fecha = fecha;
		this.destino = destino;
		this.kilometros = kilometros;
		this.listaVehiculo = listaVehiculo;
		this.listaEmpleados = listaEmpleados;
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

	public int getCodigoReserva() {
		return codigoReserva;
	}

	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
		this.listaVehiculo = listaVehiculo;
	}

	public List<Empleados> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleados> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "\n \nReservas [codigoReserva=" + codigoReserva + ", fecha=" + fecha + ", destino=" + destino
				+ ", kilometros=" + kilometros + ", listaVehiculo=" + listaVehiculo + ", listaEmpleados="
				+ listaEmpleados + "]";
	}


}
