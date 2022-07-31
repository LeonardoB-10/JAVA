package main;

import pa.Empleado;
import pa.Gerente;

public class Main {
	
	public static void main(String[] args) {
		Gerente gerente =  new Gerente("Vinicio", "Borja", "Vendedor");
		Empleado empleado = new Empleado("Doris","Borja");
		System.out.println(gerente.mostrarDatos());
		System.out.println(empleado.mostrarDatos());


		System.out.println(+fionacci(10));
		System.out.println(+newTon(4));
		String nombre = "Vinicio";
		
		Empleado[] persona = {new Empleado("Doris1","Borja1"),new Empleado("Doris2","Borja2")};
		
		for (Empleado empleado2 : persona) {
			System.out.println(empleado2.getNombre());
		}
		imprimir(empleado );

	}
	
	public static void imprimir(Empleado empleado) {
		System.out.println("Empleado polimorfismo: "+empleado.mostrarDatos());
	}
	
	public static int fionacci(int dato) {
		if(dato<2) {
			return 1;
		}else {
			return fionacci(dato-1) + fionacci(dato-2);
		}
	}
	
	public static int newTon(int dato) {
		if(dato < 2) {
			return 1;
		}else {
			return newTon(dato-1) * dato;
		}
	}
	

	
}
