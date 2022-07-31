package entidades;

import interfaces.IGarantia;

public class Monitor implements IGarantia{
	
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private double precio;
	private static int contadorMonitor;
	
	
	public Monitor(String marca, double tamanio, double precio) {
		super();
		this.idMonitor = ++Monitor.contadorMonitor;
		this.marca = marca;
		this.tamanio = tamanio;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getTamanio() {
		return tamanio;
	}


	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getIdMonitor() {
		return idMonitor;
	}


	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", precio=" + precio
				+ "]";
	}


	@Override
	public boolean incluyeGarantia(boolean garantia) {
		if(garantia) {
			System.out.println("Si tiene garantia");
			return garantia;
		}else {
			System.out.println("No tiene garantia");
			return garantia;
		}
		
	}
	
	
	




}
