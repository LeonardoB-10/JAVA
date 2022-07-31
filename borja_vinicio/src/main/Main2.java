package main;

import java.util.ArrayList;
import java.util.List;

import pa.Alumno;
import pa.Asignatura;

public class Main2 {
	
	public static void main(String[] args) {
		
      Asignatura asignatura = new Asignatura();
      Asignatura asignatura2 = new Asignatura();
      asignatura.setNrc("11A22");
      asignatura.setNombreAsignatura("Modelado avac BDD");
      asignatura2.setNrc("88A22");
      asignatura2.setNombreAsignatura("Sistemas operativos");
      List<Asignatura>  listAsig = new ArrayList<Asignatura>();
      listAsig.add(asignatura);
      listAsig.add(asignatura2);
      Alumno p22 = new Alumno("1799614513", "Daniel", "Yanez", "Santo Domingo", "0939225130", 1930, 3, 5, listAsig);
      System.out.println(p22.getListaAsignatura().toString());
	}

}
