package entidades;

public class Camara extends DispositivoEntrada{
	
	private final int idCamara;
	private static int contadorCamara;
	
	public Camara(String tipoEtrada, String marca, double precio) {
		super(tipoEtrada, marca, precio);
		this.idCamara = ++Camara.contadorCamara;
	}

	@Override
	public void detalle() {
		System.out.println(" Camara 4k - "
				+ "Sensor CMOS de fotograma completo de 30.4MP y procesador de imagen DIGIC 6+");
		
	}

	public int getIdCamara() {
		return idCamara;
	}

	@Override
	public String toString() {
		return "Camara [idCamara=" + idCamara + ", " +super.toString()+"]";
	}
	

}
