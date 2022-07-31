package pa;

public class Computadora {
	
	private final int idComputadora;
	private static int contadorComputadora;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private String desc;

	private Computadora() {
		this.idComputadora = ++this.contadorComputadora;
	}

	public Computadora(String desc,Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
		this.desc = desc;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public int getIdComputadora() {
		return idComputadora;
	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + "\n, monitor=" + monitor + "\n, teclado=" + teclado
				+ "\n, raton=" + raton + "]\n";
	}
	
	
}
