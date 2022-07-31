package pa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Empleados{
	@Id 
	private final int codigoEmpleado;
	private static int contadorEmpleado;
	private String nombre;
	private String apellido;
	private double salario;
	
	
	@OneToMany //De uno a muchos
	@JoinColumn(name="codigoOficina")
	private List<Oficinas> listaOficinas;
	

	public Empleados(String nombre, String apellido, double salario, List<Oficinas> listaOficinas) {
		this.codigoEmpleado = ++Empleados.contadorEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.listaOficinas = listaOficinas;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public List<Oficinas> getListaOficinas() {
		return listaOficinas;
	}

	public void setListaOficinas(List<Oficinas> listaOficinas) {
		this.listaOficinas = listaOficinas;
	}
	
	public  String mostrarDatps() {
		return "\nEmpleados [codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", salario=" + salario + "]";
	}

	@Override
	public String toString() {
		return "\nEmpleados [codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", salario=" + salario + ", listaOficinas=" + listaOficinas + "]";
	}
	
}
