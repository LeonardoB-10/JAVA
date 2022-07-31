package pa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id @GeneratedValue
	private int idCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idUbicacion")
	private List<Ubicacion> listaUbicacion;
	
	

	public Cliente(String cedula, String nombre, String apellido, List<Ubicacion> listaUbicacion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaUbicacion = listaUbicacion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Ubicacion> getListaUbicacion() {
		return listaUbicacion;
	}

	public void setListaUbicacion(List<Ubicacion> listaUbicacion) {
		this.listaUbicacion = listaUbicacion;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", listaUbicacion=" + listaUbicacion + "]";
	}
	
}
