package pa;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
    private long id;

    private String ci;
    private String nombres;
    private String apellidos;
    private int edad;
    private String fechaNacimiento;
    private String ciudadResidencia;
    private String contacto;
    

    public Alumno(String nombres,String apellidos,String ci) {
    	this.nombres = nombres;
    	this.apellidos = apellidos;
    	this.ci = ci;
    }

    public Alumno(String nombres,String apellidos,String ci,String fechaNacimiento) {
    	this.nombres = nombres;
    	this.apellidos = apellidos;
    	this.ci = ci;
    	this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public Alumno(long id, String ci, String nombres, String apellidos, String fechaNacimiento,
			String ciudadResidencia, String contacto) {
		this.id = id;
		this.ci = ci;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
		this.contacto = contacto;
	}



    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", ci=" + ci + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad="
				+ edad + ", fechaNacimiento=" + fechaNacimiento + ", ciudadResidencia=" + ciudadResidencia
				+ ", contacto=" + contacto + "]";
	}

}
