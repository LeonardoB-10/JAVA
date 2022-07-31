package main;

import pa.Producto;
import pa.Orden;


public class Main {
	
	public static void main(String[] args) {
		
		Producto producto = new Producto("Camara",500.0);
		Producto producto1 = new Producto("Camara2",500.0);
		Producto producto2 = new Producto("Camara3",500.0);
		
		Orden orden = new Orden();
		Orden orden2 = new Orden();
		
		orden.agregarProducto(producto1);
		orden.agregarProducto(producto2);
		orden2.agregarProducto(producto);
		
		orden.mostrarOrden();
		orden2.mostrarOrden();
		
		
	}

}
