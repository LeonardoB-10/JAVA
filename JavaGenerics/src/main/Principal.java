package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pa.Generics;

public class Principal {
	 ///////////////////////////////////////////////////////////////////
	 //                      IMPORTANCIA DE Generics
	 //			En tipo de ejecucion se !!valida!! el tipo de datos
	///////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		//Lo importanta que el constructor soporta cualquier tipo de dao
		Generics<Integer> objectInt = new Generics<>(15);
		objectInt.obtenerTipo();
		
		Generics<String> objectString = new Generics<>("Leonardo Borja");
		objectString.obtenerTipo();
		
		System.out.println("-----------------Colecciones List-------------------");
		//Son ordenados 
		List<String> lista = new ArrayList<>();
		//List<String> lista = new ArrayList<String>(); || Estos ya es redundante
		lista.add("Confirme1");
		//Ahora agrega objetos de tipo String
		lista.add("Confirme2");
		lista.add("Confirme2");
		String dato = lista.get(0);
		System.out.println(dato);
		imprimir(lista);
		
		System.out.println("-----------------Colecciones Set-------------------");
		//Son desordenados y no pueden tener repetidos
		Set<String> miMapa = new HashSet<>();
		miMapa.add("Vinicio");
		imprimir(miMapa);
		
		
		System.out.println("-----------------Colecciones Map-------------------");
		// Creating object for Map.
		
		 Map<String, String> map= new HashMap<>();
	 
		// Adding Elements using Map.
        map.put("1", "Amit");
        map.put("2", "Vijay");
        map.put("3", "Rahul");
        map.put("3", "Vinicio");
        
        // Elements can traverse in any order
        imprimir(map.keySet());
        imprimir(map.values());
         
	
	}
	
	//Al especificar el tipo de datos en el parametro puuede ocupar los metodos de tipo String 
	//O el tipo de datos que especifique
	public static void imprimir(Collection<String> collectino) {
		collectino.forEach(elemento -> {
			System.out.println("Elemento = "+elemento);
		});
		
//		for (Object elemento : collectino) {
//			System.out.println("Elemento = "+elemento);
//		}
		
	}

}
