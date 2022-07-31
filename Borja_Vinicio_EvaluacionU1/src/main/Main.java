package main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import pa.Categoria;
import pa.Cliente;
import pa.Factura;
import pa.Producto;
import pa.Ubicacion;

import pa.Vendedor;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf =
	            Persistence.createEntityManagerFactory(
	                "$objectdb/db/borjaVinicioEvaluacion.odb");
	        EntityManager em = emf.createEntityManager();

	        em.getTransaction().begin();
	        Categoria categoria =  new Categoria("SuperGrande", 100);
	        Categoria categoria2 =  new Categoria("SuperGrande", 100);
	        Categoria categoria3 =  new Categoria("SuperGrande", 100);
	        
	        List<Categoria> listCategoria =  new ArrayList<Categoria>();
	        listCategoria.add(categoria);
	        listCategoria.add(categoria2);
	        listCategoria.add(categoria3);
	        
	    	em.persist(categoria);
			em.persist(categoria2);
			em.persist(categoria3);
	        
	        
	        Ubicacion ubicacion = new Ubicacion("Santo Domingo", "Costa", "Ecuador");
	        Ubicacion ubicacion2 = new Ubicacion("Esmeraldas", "Costa", "Ecuador");
	        Ubicacion ubicacion3 = new Ubicacion("Guayaquil", "Costa", "Ecuador");
	        
	        List<Ubicacion> listUbicacion = new ArrayList<Ubicacion>();
	        listUbicacion.add(ubicacion);
	        listUbicacion.add(ubicacion2);
	        listUbicacion.add(ubicacion3);
	        
	    	em.persist(ubicacion);
			em.persist(ubicacion2);
			em.persist(ubicacion3);
	        
	        Producto producto = new Producto("Cocal cola", 1, listCategoria);
	        Producto producto2 = new Producto("Cocal cola", 1, listCategoria);
	        Producto producto3 = new Producto("Cocal cola", 1, listCategoria);
	        Producto producto4 = new Producto("Cocal cola", 1, listCategoria );
	        Producto producto5 = new Producto("Cocal cola", 1, listCategoria );
	        Producto producto6 = new Producto("Cocal cola", 1, listCategoria );
	        Producto producto7 = new Producto("Cocal cola", 1, listCategoria );
	        
	        List<Producto> listProducto = new ArrayList<Producto>();
	        listProducto.add(producto);
	        listProducto.add(producto2);
	        listProducto.add(producto3);
	        listProducto.add(producto4);
	        listProducto.add(producto5);
	        listProducto.add(producto6);
	        listProducto.add(producto7);
	        
	        em.persist(producto);
			em.persist(producto2);
			em.persist(producto3);
			em.persist(producto4);
			em.persist(producto5);
			em.persist(producto6);
			em.persist(producto7);
	        
			
			Vendedor vendedor = new Vendedor("235061451", "Vinicio1", "Borja1", 500);
			Vendedor vendedor1 = new Vendedor("2350668651", "Vinicio2", "Borja2", 500);
			Vendedor vendedor2 = new Vendedor("2350614541", "Vinicio3", "Borja3", 500);
			Vendedor vendedor3 = new Vendedor("2686061451", "Vinicio4", "Borja4", 500);
			Vendedor vendedor4 = new Vendedor("2350668651", "Vinicio5", "Borja5", 500);
			Vendedor vendedor5 = new Vendedor("2356861451", "Vinicio6", "Borja6", 500);
			Vendedor vendedor6 = new Vendedor("2350668651", "Vinicio7", "Borja7", 500);
			
			List<Vendedor> listVendedor = new ArrayList<Vendedor>();
			listVendedor.add(vendedor);
			listVendedor.add(vendedor1);
			listVendedor.add(vendedor2);
			listVendedor.add(vendedor3);
			listVendedor.add(vendedor4);
			listVendedor.add(vendedor5);
			listVendedor.add(vendedor6);
			
		    em.persist(vendedor);
			em.persist(vendedor1);
			em.persist(vendedor2);
			em.persist(vendedor3);
			em.persist(vendedor4);
			em.persist(vendedor5);
			em.persist(vendedor6);
		
			
			Cliente cliente = new Cliente("2350654454", "Leonardo", "Borja", listUbicacion);
			Cliente cliente1 = new Cliente("235065554", "Leonardo1", "Borja1", listUbicacion);
			Cliente cliente2 = new Cliente("235054454", "Leonardo2", "Borja2", listUbicacion);
			Cliente cliente3 = new Cliente("235045454", "Leonardo3", "Borja3", listUbicacion);
			Cliente cliente4 = new Cliente("2350465454", "Leonardo4", "Borja4", listUbicacion);
			Cliente cliente5 = new Cliente("234565454", "Leonardo5", "Borja5", listUbicacion);
			Cliente cliente6 = new Cliente("2350355454", "Leonardo6", "Borja6", listUbicacion);
			
			
			List<Cliente> listCliente = new ArrayList<Cliente>();
			listCliente.add(cliente6);
			listCliente.add(cliente5);
			listCliente.add(cliente4);
			listCliente.add(cliente3);
			listCliente.add(cliente2);
			listCliente.add(cliente1);
			listCliente.add(cliente);
			
		    em.persist(cliente);
			em.persist(cliente1);
			em.persist(cliente2);
			em.persist(cliente3);
			em.persist(cliente4);
			em.persist(cliente5);
			em.persist(cliente6);
			
			Factura factura = new Factura("2000/06/04", 220, 200, listVendedor, listCliente);
			Factura factura2 = new Factura("2002/06/04", 220, 200, listVendedor, listCliente);
			List<Factura> listFacturas = new ArrayList<Factura>();
			listFacturas.add(factura2);
			listFacturas.add(factura);

		    em.persist(factura2);
		    em.persist(factura);
		    em.getTransaction().commit();
		    
	        em.close();
	        emf.close();
		
	}
	
}
