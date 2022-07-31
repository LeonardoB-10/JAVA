package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import pa.Cliente;

public class Main2 {
	
	public static void main(String[] args) throws ParseException {
	      Cliente cliente = new Cliente("2350614513", "Vinicio Bojra", "Tapia", new SimpleDateFormat("dd/MM/yyyy").parse("05/11/1988"), "Brisas 2", 20, false);
	      System.out.println(cliente.getFechaNacimiento());
//	      System.out.println(cliente.fecha());
	}

}
