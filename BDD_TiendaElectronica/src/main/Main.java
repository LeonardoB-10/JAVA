package main;

import entidades.Camara;
import entidades.Microfono;
import entidades.Monitor;
import entidades.Raton;
import funcionalidad.Computadora;
import funcionalidad.Orden;

public class Main {
	
	public static void main(String[] args) {
		
		Raton raton = new Raton("USB","HP",50);
		Raton raton2 = new Raton("USB","HP",100);
		Microfono microfono = new Microfono("USB","HP",50);
		Camara camara = new Camara("USB","HP",50);
		Monitor monitor = new Monitor("LG",50.5,500);
		Monitor monitor2 = new Monitor("LG",50.5,600);
		
		Computadora computadora = new Computadora("Computadora Gamer", monitor, raton, microfono, camara);
		Computadora computadora2 = new Computadora("Computadora Gamer", monitor2, raton2, microfono, camara);

		Orden orden = new Orden();
		Orden orden2 = new Orden();
		orden.agregarComputadora(computadora);
		orden.agregarComputadora(computadora2);
		orden.mostrarOrden();
		
		orden2.agregarComputadora(computadora2);
		orden2.mostrarOrden();
		
	}

}
