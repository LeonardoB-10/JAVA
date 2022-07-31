package pa;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        System.out.println(pila.getUltimoValorIngresado());
        pila.InsertarNodo(10);
        System.out.println(pila.getUltimoValorIngresado());
        pila.InsertarNodo(15);
        System.out.println(pila.getUltimoValorIngresado());
        pila.InsertarNodo(20);
        System.out.println(pila.getUltimoValorIngresado());
        pila.InsertarNodo(20);
        System.out.println(pila.getUltimoValorIngresado());
       
    }
}
