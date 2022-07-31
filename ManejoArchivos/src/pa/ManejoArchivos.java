package pa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {
	
	//Metodo para crear un archivo TXT
	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			//Con PrinWriter se crea el archivo 
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();//Siempre es necesario ubuicar cloce 
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}
	
	
	//Hay que tener en cuenta que solo escribe linea por linea 
	public static void escribirArchivo(String nomberArchivo, String contenido) {
		File archivo = new File(nomberArchivo);
		try {
			//Con PrinWriter se crea el archivo 
			PrintWriter salida = new PrintWriter(archivo);
			salida.print(contenido);
			salida.close();//Siempre es necesario ubuicar cloce 
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}
	
	
	public static void anexarArchivo(String nomberArchivo, String contenido) {
		File archivo = new File(nomberArchivo);
		try {
			 //Si el valor es true se agrega nueva informacion 
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.print(contenido);
			salida.close();
			System.out.println("Se ha escrito en el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		
	}
	
	public static void leerArchivo(String nomberArchivo) {
		var archivo = new File(nomberArchivo);
		
		try {
			 
			//Para leer lineas completar del archivo caracter por caracter
			var entrada = new BufferedReader(new FileReader(archivo));
			
			//Se comieza a leer lineas completas del archivo 
			var lectura = entrada.readLine();
			
			//Si no se le ubica el while solo me lee la primer linea 
			while(lectura != null) {
				System.out.println("Lectura = "+lectura);
				
				//Para que vuleva a leer una nueva linea 
				lectura = entrada.readLine();
			}
			entrada.close();
			System.out.println("Se ha escrito en el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		
	}

}
