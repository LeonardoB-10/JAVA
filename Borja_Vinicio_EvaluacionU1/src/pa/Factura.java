package pa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Factura {
	
	@Id @GeneratedValue
	private int idFactura;
	private String fecha;
	private int total;
	private int formaPago;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idVendedor")
	private List<Vendedor> listaVendedor;
	
	@OneToMany // De uno a muchos
	@JoinColumn(name = "idCliente")
	private List<Cliente> listaCliente;

	
	public Factura(String fecha, int total, int formaPago, List<Vendedor> listaVendedor, List<Cliente> listaCliente) {
		super();
		this.fecha = fecha;
		this.total = total;
		this.formaPago = formaPago;
		this.listaVendedor = listaVendedor;
		this.listaCliente = listaCliente;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(int formaPago) {
		this.formaPago = formaPago;
	}

	public List<Vendedor> getListaVendedor() {
		return listaVendedor;
	}

	public void setListaVendedor(List<Vendedor> listaVendedor) {
		this.listaVendedor = listaVendedor;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", total=" + total + ", formaPago=" + formaPago
				+ ", listaVendedor=" + listaVendedor + ", listaCliente=" + listaCliente + "]";
	}
	
}
