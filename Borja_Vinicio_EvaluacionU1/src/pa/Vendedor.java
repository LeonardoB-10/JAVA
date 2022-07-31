package pa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vendedor {
	
	@Id @GeneratedValue
	private int idVendedor;
	private String identificacion;
	private String nombre;
	private String apelldo;
	private int sueldo;
	
	
	
	public Vendedor(String identificacion, String nombre, String apelldo, int sueldo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apelldo = apelldo;
		this.sueldo = sueldo;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelldo() {
		return apelldo;
	}
	public void setApelldo(String apelldo) {
		this.apelldo = apelldo;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	@Override
	public String toString() {
		return "Vendedor [idVendedor=" + idVendedor + ", identificacion=" + identificacion + ", nombre=" + nombre
				+ ", apelldo=" + apelldo + ", sueldo=" + sueldo + "]";
	}
	
}
