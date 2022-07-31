package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import pa.Empleados;
import pa.Oficinas;
import pa.Reservas;
import pa.Vehiculo;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/nueva2.odb");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------VEHICULO---------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Vehiculo vehiculo = new Vehiculo("Toyota de Nuevo");
		Vehiculo vehiculo2 = new Vehiculo("Chevrolet de Nuevo");
		Vehiculo vehiculo3 = new Vehiculo("Toyota de Nuevo");
		Vehiculo vehiculo4 = new Vehiculo("Chevrolet de Nuevo");
		Vehiculo vehiculo5 = new Vehiculo("Toyota de Nuevo");
		Vehiculo vehiculo6 = new Vehiculo("Chevrolet de Nuevo");
		Vehiculo vehiculo7 = new Vehiculo("Toyota de Nuevo");
		Vehiculo vehiculo8 = new Vehiculo("Chevrolet de Nuevo");
		Vehiculo vehiculo9 = new Vehiculo("Toyota de Nuevo");
		Vehiculo vehiculo10 = new Vehiculo("Chevrolet de Nuevo");
		List<Vehiculo> listVehi =  new ArrayList<Vehiculo>();
		listVehi.add(vehiculo);
		listVehi.add(vehiculo2);
		listVehi.add(vehiculo3);
		listVehi.add(vehiculo4);
		listVehi.add(vehiculo5);
		listVehi.add(vehiculo6);
		listVehi.add(vehiculo7);
		listVehi.add(vehiculo8);
		listVehi.add(vehiculo9);
		listVehi.add(vehiculo10);
		em.persist(vehiculo);
		em.persist(vehiculo2);
		em.persist(vehiculo3);
		em.persist(vehiculo4);
		em.persist(vehiculo5);
		em.persist(vehiculo6);
		em.persist(vehiculo7);
		em.persist(vehiculo8);
		em.persist(vehiculo9);
		em.persist(vehiculo10);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
////---------------------------------------------------OFICINA---------------------------------------------------
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Oficinas oficina = new Oficinas("Brisas #2", "Frente a una iglesia", "El oro");
		Oficinas oficina2 = new Oficinas("Los Rosales", "Terminal", "SantoDomingo");
		Oficinas oficina3 = new Oficinas("Los Rosales8", "Guayaquil", "El oro");
		Oficinas oficina4 = new Oficinas("Los Rosales7", "Terminal2", "SantoDomingo");
		Oficinas oficina5 = new Oficinas("Los Rosales6", "Guayaquil", "SantoDomingo");
		Oficinas oficina6 = new Oficinas("Los Rosales5", "Terminal4", "El oro");
		Oficinas oficina7 = new Oficinas("Los Rosales4", "Terminal5", "El oro");
		Oficinas oficina8 = new Oficinas("Los Rosales3", "Guayaquil", "SantoDomingo");
		Oficinas oficina9 = new Oficinas("Los Rosales2", "Terminal7", "Guayaquil");
		Oficinas oficina10 = new Oficinas("Los Rosales1", "Terminal8", "Guayaquil");
		em.persist(oficina);
		em.persist(oficina2);
		em.persist(oficina3);
		em.persist(oficina4);
		em.persist(oficina5);
		em.persist(oficina6);
		em.persist(oficina7);
		em.persist(oficina8);
		em.persist(oficina9);
		em.persist(oficina10);
		List<Oficinas> listOfic =  new ArrayList<Oficinas>();
		listOfic.add(oficina);
		listOfic.add(oficina2);
		listOfic.add(oficina3);
		listOfic.add(oficina4);
		listOfic.add(oficina5);
		listOfic.add(oficina6);
		listOfic.add(oficina7);
		listOfic.add(oficina8);
		listOfic.add(oficina9);
		listOfic.add(oficina10);
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
////---------------------------------------------------EMPLEADO---------------------------------------------------
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Empleados empleado = new Empleados("Leonardo", "Borja10", 1500.0, listOfic);
		Empleados empleado2 = new Empleados("Doris", "Tapia9", 1500.0, listOfic);
		Empleados empleado3 = new Empleados("Doris1", "Tapia1", 1500.0, listOfic);
		Empleados empleado4 = new Empleados("Doris2", "Tapia2", 1200.0, listOfic);
		Empleados empleado5 = new Empleados("Doris3", "Tapia3", 1300.0, listOfic);
		Empleados empleado6 = new Empleados("Doris4", "Tapia4", 1500.0, listOfic);
		Empleados empleado7 = new Empleados("Doris5", "Tapia5", 1000.0, listOfic);
		Empleados empleado8 = new Empleados("Doris6", "Tapia6", 1500.0, listOfic);
		Empleados empleado9 = new Empleados("Doris7", "Tapia7", 1150.0, listOfic);
		Empleados empleado10 = new Empleados("Doris8", "Tapia8", 1500.0, listOfic);
		em.persist(empleado);
		em.persist(empleado2);
		em.persist(empleado3);
		em.persist(empleado4);
		em.persist(empleado5);
		em.persist(empleado6);
		em.persist(empleado7);
		em.persist(empleado8);
		em.persist(empleado9);
		em.persist(empleado10);
		List<Empleados> listEmpl =  new ArrayList<Empleados>();
		listEmpl.add(empleado);
		listEmpl.add(empleado2);
		listEmpl.add(empleado3);
		listEmpl.add(empleado4);
		listEmpl.add(empleado5);
		listEmpl.add(empleado6);
		listEmpl.add(empleado7);
		listEmpl.add(empleado8);
		listEmpl.add(empleado9);
		listEmpl.add(empleado10);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
////---------------------------------------------------EMPLEADO---------------------------------------------------
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Reservas reserva = new Reservas("2000/06/04", "Santo Domingo", 500, listVehi, listEmpl);
		Reservas reserva2 = new Reservas("2025/06/04", "Santo Domingo1", 500, listVehi, listEmpl);
		Reservas reserva3 = new Reservas("2025/06/04", "Manta", 500, listVehi, listEmpl);
		Reservas reserva4 = new Reservas("2025/06/04", "Santo Domingo1", 500, listVehi, listEmpl);
		Reservas reserva5 = new Reservas("2025/06/04", "Santo Domingo3", 500, listVehi, listEmpl);
		Reservas reserva6 = new Reservas("2025/06/04", "Manta", 500, listVehi, listEmpl);
		Reservas reserva7 = new Reservas("2025/06/04", "Santo Domingo4", 500, listVehi, listEmpl);
		Reservas reserva8 = new Reservas("2025/06/04", "Manta", 500, listVehi, listEmpl);
		Reservas reserva9 = new Reservas("2025/06/04", "Santo Domingo5", 500, listVehi, listEmpl);
		Reservas reserva10 = new Reservas("2025/06/04", "Manta", 500, listVehi, listEmpl);
		
		em.persist(reserva);
		em.persist(reserva2);
		em.persist(reserva3);
		em.persist(reserva4);
		em.persist(reserva5);
		em.persist(reserva6);
		em.persist(reserva7);
		em.persist(reserva8);
		em.persist(reserva9);
		em.persist(reserva10);
		List<Reservas> listReserve = new ArrayList<Reservas>();
		listReserve.add(reserva2);
		listReserve.add(reserva);
		listReserve.add(reserva3);
		listReserve.add(reserva4);
		listReserve.add(reserva5);
		listReserve.add(reserva6);
		listReserve.add(reserva7);
		listReserve.add(reserva8);
		listReserve.add(reserva9);
		listReserve.add(reserva10);
//		
		em.getTransaction().commit();

//		 TypedQuery<Reservas> query =
//		            em.createQuery("SELECT p FROM Reservas p", Reservas.class);
//		        List<Reservas> results = query.getResultList();
//		        int cont = 0;
//		        for (Reservas p : results) {
//		        	System.out.println(p.getListaEmpleados().get(cont).getListaOficinas().get(cont).getProvincia());
//		        	cont += 1;	
//		        }

//	    System.out.println("1) Contar cuantas reservas existen con destino Manta");
//		 TypedQuery<Reservas> query =
//		            em.createQuery("SELECT p FROM Reservas p", Reservas.class);
//		        List<Reservas> results = query.getResultList();
//		        int contador = 0;
//		        for (Reservas p : results) {
//		        	if(p.getDestino().equals("Manta")) {
//		        		contador += 1;      		
//		        	}
//		        }
//		        System.out.println("Total reservas en Manta: "+contador);
////		        
////		      
//		 System.out.println("");
//		 System.out.println("");
//		 System.out.println("2) Listar las oficinas que se encuentran en la provincia Santo DOmingo");   
//	   	 TypedQuery<Reservas> query2 =
//		            em.createQuery("SELECT p FROM Reservas p", Reservas.class);
//		        List<Reservas> results2 = query2.getResultList();
//		        int cont = 0;
//		        
//		        for (Reservas p : results2) {
//		        	if(p.getListaEmpleados().get(cont).getListaOficinas().get(cont).getProvincia().equals("SantoDomingo")) {
//		        		System.out.println(p.getListaEmpleados().get(cont).getListaOficinas().get(cont));
//		        	}
//		        	cont += 1;	
//		        }
//		        
//
//		System.out.println("");
//		System.out.println("");
//		System.out.println("3) Listar los empleados cuyo salario este entre $800 y $1200");
//		TypedQuery<Reservas> query3 = em.createQuery("SELECT p FROM Reservas p", Reservas.class);
//		List<Reservas> results3 = query3.getResultList();
//		int cont3 = 0;
//		for (Reservas p : results3) {
//			if (p.getListaEmpleados().get(cont3).getSalario() >= 800.0
//					&& p.getListaEmpleados().get(cont3).getSalario() <= 1200.0) {
//				System.out.println(p.getListaEmpleados().get(cont3).mostrarDatps());
//			}
//			cont3 += 1;
//		}
//		
//		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("4) Listar los empleados cuya oficina se encuentre en la localidad Guayaquil.");
//		TypedQuery<Reservas> query4 = em.createQuery("SELECT p FROM Reservas p Where p.getListaOficinas", Reservas.class);
//		List<Reservas> results4 = query4.getResultList();
//		System.out.print(results4);
//		int cont4 = 0;
//		for (Reservas p : results4) {
//			if (p.getListaEmpleados().get(cont4).getListaOficinas().get(cont4).getLocalidad().equals("Terminal")) {
//				String localidad = p.getListaEmpleados().get(cont4).getListaOficinas().get(cont4).getLocalidad();
//				System.out.println(p.getListaEmpleados().get(cont4).mostrarDatps() + " - "+ localidad);
//			}
//			cont4 += 1;
//		}
//		
		
	     
//	      Query q3 = 	em.createQuery("SELECT cliente FROM Cliente cliente WHERE cliente.getFechaNacimiento() = {d '06-11-1998'}");
//	      System.out.println("Total Alumnos: " + q3.getResultList());
	      
	    //q4: Listar los empleados cuya oficina se encuentre en la localidad Guayaquil.
	      Query q4 = em.createQuery("SELECT e.getNombre() from Empleados e WHERE e.listaOficinas.localidad = 'Guayaquil'");
	      System.out.println("Empleados cuya oficina se encuentre en la localidad Guayaquil: " + q4.getResultList());
	      Set<String> set = new HashSet<String>();
	      for (int i = 0; i < q4.getResultList().size(); i++) {
	    	  set.add((String) q4.getResultList().get(i));
	      }
	      
	      for (String datos : set) {
			System.out.println(datos);
		}
	      
//		System.out.println("");
//		System.out.println("");
//		System.out.println("4) Prueba.");
//		TypedQuery<Empleados> query5 = em.createQuery("SELECT p FROM Empleados p Where p.listaOficinas.localidad = 'Guayaquil'", Empleados.class);
//		List<Empleados> results5 = query5.getResultList();
//		System.out.print(results5);
//		int contador = 0;
//		for (Empleados p : results5) {
//			System.out.println(p.getListaOficinas().get(contador));
//			contador+=1;
//		}

		
		//q4: Listar los empleados cuya oficina se encuentre en la localidad Guayaquil.
//        Query q4 = em.createQuery("SELECT e from Empleados e where e.oficinas.localidad; = 'Guayaquil'");
//        System.out.println("Empleados cuya oficina se encuentre en la localidad Guayaquil: " + q4.getResultList());
		
		em.close();
		emf.close();
	}

}
