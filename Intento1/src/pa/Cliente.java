package pa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Cliente")
public class Cliente {
	private static final long serialVersionUID = 1L;
	
	@Id
	private final int id;
	private static int contadorCliente;
	private String ci;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccion;
    private int edad;
    private boolean estado;
     
	public Cliente(String ci, String nombres, String apellidos, Date fechaNacimiento, String direccion, int edad,
			boolean estado) {
		
		this.ci = ci;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.edad = edad;
		this.estado = estado;
		this.id = ++Cliente.contadorCliente;
	}



	public int getId() {
		return id;
	}


	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String fecha() {
		return getFechaNacimiento().getDay()+""+getFechaNacimiento().getMonth()+""+getFechaNacimiento().getYear();
	}

	@Override
	public String toString() {
		return "Cliente [ci=" + ci + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", edad=" + edad + ", estado=" + estado + "]";
	}
    

}
