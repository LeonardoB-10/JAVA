package pa;
import javax.swing.JOptionPane;

public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    
    public Nodo getUltimoValorIngresado() {
		return UltimoValorIngresado;
	}
    
    public Nodo getUltimoValorIngresadoSiguiente() {
		return UltimoValorIngresado.siguiente;
	}


	public int getTamano() {
		return tamano;
	}


	public String getLista() {
		return Lista;
	}


	//Método para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;       
//        System.out.println("nuevo_nocdo.siguiente- "+nuevo_nocdo.siguiente+"---"+" UltimoValorIngresado- "+UltimoValorIngresado);
        tamano++; 
    }        
    
    //Método para eliminar un nodo de la pila
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
//        System.out.println(UltimoValorIngresado.siguiente);
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
       
        tamano--;
        return auxiliar;
    }
    
    //Método para conocer cual es el último valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //Método para conocer el tamaño de la Pila
    public int TamanoPila(){
        return tamano;
    }
    
    //Método para vaciar la Pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();            
        }
    }
    
    //Método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
