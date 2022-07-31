package entidades;

public class Raton extends DispositivoEntrada{

	private final int idRaton;
	private static int contadorRaton;
	
	public Raton(String tipoEtrada, String marca, double precio) {
		super(tipoEtrada, marca, precio);
		this.idRaton = ++Raton.contadorRaton;
	}


	@Override
	public void detalle() {
		System.out.println("Rgb 7 Botones Inalambrico Recargable");
		
	}


	public int getIdRaton() {
		return idRaton;
	}


	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton +", "+ super.toString()+"]";
	}



	
	
	

}
