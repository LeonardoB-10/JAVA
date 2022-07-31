package pa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Detalle_Factura {
	
	private int cantidad;
	private int totalDescuento;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idFactura")
	private List<Factura> listaFactura;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idPoducto")
	private List<Producto> listaProducto;

	public Detalle_Factura(int cantidad, int totalDescuento, List<Factura> listaFactura) {
		this.cantidad = cantidad;
		this.totalDescuento = totalDescuento;
		this.listaFactura = listaFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getTotalDescuento() {
		return totalDescuento;
	}

	public void setTotalDescuento(int totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	public List<Factura> getListaFactura() {
		return listaFactura;
	}

	public void setListaFactura(List<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}

	@Override
	public String toString() {
		return "Detalle_Factura [cantidad=" + cantidad + ", totalDescuento=" + totalDescuento + ", listaFactura="
				+ listaFactura + "]";
	}
	

}
