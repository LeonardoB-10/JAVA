package main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import pa.Alumno;
import pa.Asignatura;

public class Main {
	
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(
                "$objectdb/db/p43.odb");
        EntityManager em = emf.createEntityManager();

        // Store 1000 Alumno objects in the database:
      em.getTransaction().begin();
//      Asignatura asignatura = new Asignatura();
//      Asignatura asignatura2 = new Asignatura();
//      asignatura.setNrc("11A22");
//      asignatura.setNombreAsignatura("Modelado avac BDD");
//      asignatura2.setNrc("88A22");
//      asignatura2.setNombreAsignatura("Sistemas operativos");
//      	List<Asignatura>  listAsig = new ArrayList<Asignatura>();
////      List<Asignatura>  listAsig = new ArrayList<Asignatura>();
//      listAsig.add(asignatura);
//      listAsig.add(asignatura2);
//      	Alumno p22 = new Alumno("1799614513", "Daniel", "Yanez", "Santo Domingo", "0939225130", 1930, 3, 5, listAsig);
//      Alumno p2 = new Alumno("1753514513", "Doris", "Espinosa", "Santo Domingo", "0939225164", 2001, 3, 5);
//      Alumno p3 = new Alumno("1750614513", "Jessie", "Egas", "Santo Domingo", "0939225130", 1950, 3, 5);
//      Alumno p4 = new Alumno("1750614813", "Santiago", "Chuba", "Santo Domingo", "0939225130", 2001, 3, 5);
//      Alumno p5 = new Alumno("1750618413", "Ruben", "Ramires", "Santo Domingo", "0939225130", 1900, 3, 5);
//      Alumno p6 = new Alumno("1750614513", "Karen", "Pantoja", "Santo Domingo", "0939225130", 1980, 3, 5);
//      Alumno p7 = new Alumno("2350654668", "Daniela", "Congacha", "Santo Domingo", "0939225164", 2001, 3, 5);
//      Alumno p8 = new Alumno("486614513", "Dario", "Pantoja", "Santo Domingo", "0939225130", 1999, 3, 5);
//      Alumno p9 = new Alumno("8668614513", "Carlos", "Pantoja", "Santo Domingo", "0939225130", 2001, 3, 5);
//      Alumno p10 = new Alumno("2358714513", "Ruben", "Cabrera", "Santo Domingo", "0939225130", 20009, 3, 5);
//      Alumno p11 = new Alumno("177814513", "Daniel", "Pantoja", "Santo Domingo", "0939225164", 1900, 3, 5);
//      Alumno p12 = new Alumno("8860614513", "Steven", "Pantoja", "Santo Domingo", "0939225130", 2009, 3, 5);
//      Alumno p13 = new Alumno("7990614513", "Sofia", "Cantos", "Santo Domingo", "0939225130", 2001, 3, 5);
//      Alumno p14 = new Alumno("5770614513", "Jordan", "Borja", "Santo Domingo", "0939225130", 1980, 3, 5);
//      Alumno p15 = new Alumno("3560614513", "Luis", "Pantoja", "Santo Domingo", "0939225130", 1980, 3, 5);
//      Alumno p16 = new Alumno("9870614513", "Justin", "Alencastro", "Santo Domingo", "0939225130", 1900, 3, 5);
//      Alumno p17 = new Alumno("4210614513", "Leo", "Tapia", "Santo Domingo", "0939225130", 1900, 3, 5);
//      Alumno p18 = new Alumno("2360614513", "Angel", "Cueva", "Santo Domingo", "0939225130", 1985, 3, 5);
//      Alumno p19 = new Alumno("9860614513", "Milena", "Cantos", "Santo Domingo", "0939225164", 2001, 3, 5);
//      Alumno p20 = new Alumno("7890614513", "Elian", "Ochoa", "Santo Domingo", "0939225130", 2001, 3, 5);
     
//      em.persist(p22);
//      em.persist(p2);
//      em.persist(p3);
//      em.persist(p4);
//      em.persist(p5);
//      em.persist(p6);
//      em.persist(p7);
//      em.persist(p8);
//      em.persist(p9);
//      em.persist(p10);
//      em.persist(p11);
//      em.persist(p12);
//      em.persist(p13);
//      em.persist(p14);
//      em.persist(p15);
//      em.persist(p16);
//      em.persist(p17);
//      em.persist(p18);
//      em.persist(p19);
//      em.persist(p20);

        
        em.getTransaction().commit();

        // Find the number of Alumno objects in the database:
        System.out.println("1. Consultar los objetos con CI que empiecen con 17");
        Query q1 = em.createQuery("SELECT p FROM Alumno p where p.ci LIKE '17%'");
        System.out.println("Total Alumnos: " + q1.getResultList());
        System.out.println("\n");
//        System.out.println("2. Consultar los objetos con edad mayor a 25");
//        Query q2 = em.createQuery("SELECT p FROM Alumno p where p.fehcaActual() > 25");
//        System.out.println("Total Alumnos: " + q2.getResultList());
//        // Find the average X value:
//        System.out.println("\n");
//        System.out.println("3. Consultar los objetos con fecha de nacimiento entre '2000/01/01' hasta '2022/01/01'");
//        Query q3 = em.createQuery("SELECT p FROM Alumno p WHERE p.getYear() BETWEEN 2000  AND 2022");
//        System.out.println("Total Alumnos: " + q3.getResultList());
//        System.out.println("\n");
//        System.out.println("4. Consultar los objetos con ciudad de residencia 'Santo Domingo'");
//        Query q4 = em.createQuery("SELECT p FROM Alumno p WHERE p.getYear() BETWEEN 2000  AND 2022");
//        System.out.println("Total Alumnos: " + q4.getResultList());
//        System.out.println("\n");
//        System.out.println("5. Consultar el primero objeto que tenga la edad de 21 años y teléfono que termine con 64.");
//        Query q5 = em.createQuery("SELECT p FROM Alumno p WHERE p.fehcaActual() = 21 AND p.contacto LIKE '%64'");
//        System.out.println("Total Alumnos: " + q5.getResultList());
        // Retrieve all the Alumno objects from the database:
//        TypedQuery<Alumno> query =
//            em.createQuery("SELECT p FROM Alumno p", Alumno.class);
//        List<Alumno> results = query.getResultList();
//        for (Alumno p30 : results) {
//            System.out.println(p30);
//        }

        
//      Query q1 = em.createQuery("SELECT p FROM Alumno p");
//      System.out.println("Total Alumnos: " + q1.getResultList());
        // Close the database connection:
        em.close();
        emf.close();
    }

}

