package main;

import static pa.ManejoArchivos.*;

public class Principal {
	
	public static void main(String[] args) {
		var nombreArchivo = "prueba.txt";
		
		//Se comenta la lina debido al que el arvico ya se creo
		//crearArchivo(nombreArchivo);
		
		//Escribe la informacion en un archivo pero la elimina
		//escribirArchivo(nombreArchivo, "El mejor de todos");
		//escribirArchivo(nombreArchivo, "El mejor de todos2");

		//Guarda la informacion del archivo sin eliminar la que ya esta 
		//anexarArchivo(nombreArchivo, "\nEl mejor de todos\n");
		//anexarArchivo(nombreArchivo, "El mejor de todos2");
		
		leerArchivo(nombreArchivo);
	}

}
