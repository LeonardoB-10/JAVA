/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author VINICIO BORJA
 */
public class Almacen {

    private int codigo;
    private String nombre;
    private String descripcion;
    private Double precio_unitairo;
    private Double costo_produccion;
    private String fecha_elaboracion;

    // Sobrecarga de constructores
    public Almacen() {

    }

    // Cuando solo sea necesario el ID - para eliminar
    public Almacen(int codigo) {
        this.codigo = codigo;
    }

    // Cuando se quiera registrar un prodocto al almacen no se ocupa el id - se
    // genera automaticamente
    public Almacen(String nombre, String descripcion, Double precio_unitairo, Double costo_produccion,
            String fecha_elaboracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitairo = precio_unitairo;
        this.costo_produccion = costo_produccion;
        this.fecha_elaboracion = fecha_elaboracion;
    }

    // Cuano se edita se necesita todo los parametros
    public Almacen(int codigo, String nombre, String descripcion, Double precio_unitairo, Double costo_produccion,
            String fecha_elaboracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitairo = precio_unitairo;
        this.costo_produccion = costo_produccion;
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio_unitairo() {
        return precio_unitairo;
    }

    public Double getCosto_produccion() {
        return costo_produccion;
    }

    public String getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio_unitairo(Double precio_unitairo) {
        this.precio_unitairo = precio_unitairo;
    }

    public void setCosto_produccion(Double costo_produccion) {
        this.costo_produccion = costo_produccion;
    }

    public void setFecha_elaboracion(String fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    @Override
    public String toString() {
        return "Almacen{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio_unitairo=" + precio_unitairo + ", costo_produccion=" + costo_produccion + ", fecha_elaboracion=" + fecha_elaboracion + '}';
    }

    
}
