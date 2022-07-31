package pa;

public class Oficinas {
	
	private int codigoOficina;
	private String direccion;
	private String localidad;
	private String provincia;
	
	public Oficinas(String direccion, String localidad, String provincia) {
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCodigoOficina() {
		return codigoOficina;
	}

	@Override
	public String toString() {
		return "Oficinas [codigoOficina=" + codigoOficina + ", direccion=" + direccion + ", localidad=" + localidad
				+ ", provincia=" + provincia + "]";
	}
	
}
