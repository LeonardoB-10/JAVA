/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author VINICIO BORJA
 */
public class Prueba {
    
    
    public static void main(String[] args) {
        
        Almacen almance = new AlmacenDao().encontrar(new Almacen(2));
        System.out.print(almance);
    }
    
}
