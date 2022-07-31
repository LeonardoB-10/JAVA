package pa;

public class Empleados {
	
	private int codigoEmpleado;
	private String nombre;
	private String apellido;
	private double salario;
	private int codigoOficina;
	
	public Empleados(String nombre, String apellido, double salario, int codigoOficina) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.codigoOficina = codigoOficina;
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

	public int getCodigoOficina() {
		return codigoOficina;
	}

	public void setCodigoOficina(int codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	@Override
	public String toString() {
		return "Empleados [codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", salario=" + salario + ", codigoOficina=" + codigoOficina + "]";
	}
	
}
