package domain;

//Mayormente conocida como clase de entidad
public class Categoria {

	private int ID_categoria;
	private String nombreC;
	private String descripC;

	public Categoria() {

	}

	public Categoria(int ID_categoria) {
		this.ID_categoria = ID_categoria;
	}

	public Categoria(String nombreC, String descripC) {
		this.nombreC = nombreC;
		this.descripC = descripC;
	}

	public Categoria(int ID_categoria, String nombreC, String descripC) {
		this.ID_categoria = ID_categoria;
		this.nombreC = nombreC;
		this.descripC = descripC;

	}

	public int getID_categoria() {
		return ID_categoria;
	}

	public void setID_categoria(int iD_categoria) {
		ID_categoria = iD_categoria;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getDescripC() {
		return descripC;
	}

	public void setDescripC(String descripC) {
		this.descripC = descripC;
	}

	@Override
	public String toString() {
		return "Persona [ID_categoria=" + ID_categoria + ", nombreC=" + nombreC + ", descripC=" + descripC + "]";
	}

}
