package funcionalidad;


public class Orden {

	private final int idOrden;
	private Computadora computadora[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAX_COMPUTADORAS = 10;

	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadora = new Computadora[MAX_COMPUTADORAS];
	}

	public void agregarComputadora(Computadora computadoras) {
		if (this.contadorComputadoras < this.MAX_COMPUTADORAS) {
			computadora[this.contadorComputadoras++] = computadoras;

		} else {
			System.out.println("Cantidad maxima alcazanda");
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < contadorComputadoras; i++) {
			total += computadora[i].getRoton().getPrecio() + computadora[i].getCamara().getPrecio()
					+ computadora[i].getMonitor().getPrecio() 
					+ computadora[i].getMicrofono().getPrecio();
		}
		return total;
	}

	public void mostrarOrden() {
		System.out.println("Orden: "+this.idOrden);
		System.out.println("El total es: "+calcularTotal());
		System.out.println();
		for (int i = 0; i < contadorComputadoras; i++) {
			System.out.println(computadora[i].toString());
			System.out.println(computadora[i].getMonitor().incluyeGarantia(true));
		}
		System.out.println("-------------------------------------------------------");

	
	}

}
