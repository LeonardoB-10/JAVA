package pa;

public class Gerente extends Empleado{
	
	private String cargo;
	
	public Gerente(String nombre, String apellido, String cargo) {
		super(nombre,apellido);
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos() + ", Gerente: " + getCargo();
	}

}
