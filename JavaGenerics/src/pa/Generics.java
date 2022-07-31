package pa;

public class Generics<T> {
	
	private T objeto;
	
	public Generics(T objeto) {
		this.objeto = objeto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo de T es: "+ objeto.getClass().getSimpleName());
	}

}
