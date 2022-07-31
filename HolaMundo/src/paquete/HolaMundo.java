package paquete;

public class HolaMundo {
	
	String nombre, apelldio;
    double precio;

    public HolaMundo(String nombre, String apelldio, double precio) {
        this.nombre = nombre;
        this.apelldio = apelldio;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "HolaMundo{" +
                "nombre='" + nombre + '\'' +
                ", apelldio='" + apelldio + '\'' +
                ", precio=" + precio +
                '}';
    }

}
