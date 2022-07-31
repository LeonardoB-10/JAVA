package pa;

public class Orden {
	
	private final int idOrden;
	private Producto productos[];
	private int contadorProdcutos;
	private static int contadorOrden;
	private static final int MAX_PRODUCTOS = 10; 
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrden;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
		
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProdcutos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProdcutos++] = producto;
		}else {
			System.out.println("Cantidad Maxima de prodcutos");
		}
	}
	
	public double calcularTotal() {
		double acumulador = 0;
		for (int i = 0; i < this.contadorProdcutos; i++) {
			acumulador += this.productos[i].getPrecio();
		}
		return acumulador;
	}
	
	public void mostrarOrden() {
		System.out.println("ID Orden: "+this.idOrden);
		System.out.println("Total Calculado: "+calcularTotal());
		for (int i = 0; i < this.contadorProdcutos; i++) {
			System.out.println(productos[i].toString());
		}
		System.out.println("\n");
	}

}
