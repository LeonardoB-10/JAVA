package pa;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Asignatura {
	
	@Id 
	private String nrc;
	private String nombreAsignatura;
	
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	@Override
	public String toString() {
		return "Asignatura [nrc=" + nrc + ", nombreAsignatura=" + nombreAsignatura + "]";
	}
	
	

}
