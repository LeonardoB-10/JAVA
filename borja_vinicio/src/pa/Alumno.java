package pa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue//autoincremental
    private long id;
	private static int contador = 0;
	private final int idAcumulador;
    private String ci;
    private String nombres;
    private String apellidos;
    private int year;
    private int mes;
    private int dia;
    private String ciudadResidencia;
    private String contacto;
    
    @OneToMany //De uno a muchos
    @JoinColumn(name="nrc")
    private List<Asignatura> listaAsignatura;
    

    public Alumno(String ci, String nombres, String apellidos,
			String ciudadResidencia, String contacto,int year,int mes,int dia,List<Asignatura> listaAsignatura) {
		this.ci = ci;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ciudadResidencia = ciudadResidencia;
		this.contacto = contacto;
		this.year = year;
    	this.mes = mes;
    	this.dia = dia;
    	this.listaAsignatura = listaAsignatura;
    	this.idAcumulador = contador++;
	}
    

    public int getIdAcumulador() {
		return idAcumulador;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int fehcaActual() {
		LocalDate today = LocalDate.now();
		LocalDate fecha = LocalDate.of(getYear(),getMes(),getDia());
		int years = Period.between(fecha, today).getYears();
		return years;
	}
	
	

	public List<Asignatura> getListaAsignatura() {
		return listaAsignatura;
	}

	public void setListaAsignatura(ArrayList<Asignatura> listaAsignatura) {
		this.listaAsignatura = listaAsignatura;
	}

	@Override
	public String toString() {
		String acumulador = "";
		for (int i = 0; i < listaAsignatura.size(); i++) {
			acumulador = acumulador + " - " +listaAsignatura.get(i).getNombreAsignatura();
		}
		return "Alumno [id=" + id + ", ci=" + ci + ", nombres=" + nombres + ", apellidos=" + apellidos + ", year="
				+ year + ", mes=" + mes + ", dia=" + dia + ", ciudadResidencia=" + ciudadResidencia + ", contacto="
				+ contacto + ", listaAsignatura.=" +acumulador+ "]";
	}


	
	


}
