package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import pa.Cliente;

public class Main {
	
    public static void main(String[] args) throws ParseException {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(
                "$objectdb/db/p4347.odb");
        EntityManager em = emf.createEntityManager();

      em.getTransaction().begin();

//      Cliente cliente = new Cliente("2350614513", "Vinicio Bojra", "Tapia", new SimpleDateFormat("dd/MM/yyyy").parse("05/11/1988"), "Brisas 2", 20, false);
      
//      em.persist(cliente);
      em.getTransaction().commit();
      
      Query q1 = em.createQuery("SELECT p FROM Cliente p where p.isEstado() = false");
      System.out.println("Total Alumnos: " + q1.getResultList());
      System.out.println("\n");
      System.out.println();
      

      

      
      Query q3 = 	em.createQuery("SELECT cliente FROM Cliente cliente WHERE cliente.getFechaNacimiento() = {d '06-11-1998'}");
      System.out.println("Total Alumnos: " + q3.getResultList());
      	
      	
      	em.close();
        emf.close();
    }

}

