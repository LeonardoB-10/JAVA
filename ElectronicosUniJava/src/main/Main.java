package main;

import pa.Computadora;
import pa.Monitor;
import pa.Orden;
import pa.Raton;
import pa.Teclado;

public class Main {
	
	public static void main(String[] args) {
		
		Raton raton = new Raton("USB", "HP");
		Teclado teclado = new Teclado("USB-2", "Lenovo");
		Monitor monitor = new Monitor("LG",15.5);
		Monitor monitor2 = new Monitor("LG-super",15.5);
		Computadora computadora = new Computadora("Computadora Gamaer ",monitor, teclado, raton);
		Computadora computadora2 = new Computadora("Computadora Gamaer super",monitor2, teclado, raton);
		Orden orden = new Orden();
		Orden orden2 = new Orden();
		orden.agregarComputadora(computadora);
		orden.agregarComputadora(computadora2);
		orden.mostrarOrden();

	}

}
