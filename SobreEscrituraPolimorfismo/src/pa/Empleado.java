package pa;

public class Empleado {
	
	private String nombre;
	private String apellido;
	
	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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
	
	public String mostrarDatos() {
		return "Nombre: "+getNombre() + ", Apellido: " + getApellido();
	}

}
