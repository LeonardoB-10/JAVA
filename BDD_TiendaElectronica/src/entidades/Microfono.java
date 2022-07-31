package entidades;

public class Microfono extends DispositivoEntrada{
	
	private final int idMicrofono;
	private static int contadorMicrofono;
	
	public Microfono(String tipoEtrada, String marca, double precio) {
		super(tipoEtrada, marca, precio);
		this.idMicrofono = ++Microfono.contadorMicrofono;
	}

	@Override
	public void detalle() {
		System.out.println("\r\n"
				+ "Micrófono inalámbrico, UHF Dual Wireless");
		
	}

	public int getIdMicrofono() {
		return idMicrofono;
	}

	@Override
	public String toString() {
		return "Microfono [idMicrofono=" + idMicrofono + ", "+super.toString() +"]";
	}
	
}
