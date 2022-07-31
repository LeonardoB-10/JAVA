package entidades;

public abstract class DispositivoEntrada {
	
	private String tipoEtrada;
	private String marca;
	private double precio;
	
	public DispositivoEntrada(String tipoEtrada,String marca,double precio) {
		this.tipoEtrada = tipoEtrada;
		this.marca = marca;
		this.precio = precio;
	}
	
	public abstract void detalle();

	public String getTipoEtrada() {
		return tipoEtrada;
	}

	public void setTipoEtrada(String tipoEtrada) {
		this.tipoEtrada = tipoEtrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEtrada=" + tipoEtrada + ", marca=" + marca + ", precio=" + precio + "]";
	}
	

}
