package pa;

public class Orden {
	
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAX_COMPUTADORAS = 10;
	
	public Orden() {
		this.idOrden = ++this.contadorOrdenes;
		this.computadoras = new Computadora[MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras < this.MAX_COMPUTADORAS) {
			computadoras[this.contadorComputadoras++] = computadora;
		}else {
			System.out.println("Cantidad maxima alcazanda");
		}
	}
	
	public void mostrarOrden() {
		System.out.println("ID_ORDEN: "+this.idOrden);
		for (int i = 0; i < this.contadorComputadoras; i++) {
			System.out.println(computadoras[i].toString());
		}
	}
	

}
