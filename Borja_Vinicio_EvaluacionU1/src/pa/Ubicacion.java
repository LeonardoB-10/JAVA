package pa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ubicacion {
	
	@Id @GeneratedValue
	private int idUbicacion;
	private String ciudad;
	private String region;
	private String pais;
	
	public Ubicacion(String ciudad, String region, String pais) {
		super();
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Ubicacion [idUbicacion=" + idUbicacion + ", ciudad=" + ciudad + ", region=" + region + ", pais=" + pais
				+ "]";
	}

}
