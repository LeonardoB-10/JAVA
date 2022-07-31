package pa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Producto {
	
	@Id @GeneratedValue
	private int idPoducto;
	private String nombre;
	private int precio;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idCategoria")
	private List<Categoria> listaCategoria;

	
	

	public Producto(String nombre, int precio, List<Categoria> listaCategoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.listaCategoria = listaCategoria;
	}

	public int getIdPoducto() {
		return idPoducto;
	}

	public void setIdPoducto(int idPoducto) {
		this.idPoducto = idPoducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public List<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

	@Override
	public String toString() {
		return "Producto [idPoducto=" + idPoducto + ", nombre=" + nombre + ", precio=" + precio + ", listaCategoria="
				+ listaCategoria + "]";
	}


}
