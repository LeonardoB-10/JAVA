
public class Gato extends Animal{

   /**
    * Constructor explicito clase Gato
    * @param nombre
    */
    public Gato(String nombre) {
  super(nombre);//envia el parametro a el constructor de la clase padre
 System.out.println("Constructor Gato, nombre : "+nombre);
    }

    public void tipoAnimal() {
 System.out.println("Tipo Animal : Es un Gato");
    }

    public void comunicarse(){
  System.out.println("Metodo comunicarse : El gato maulla... Miau Miau");
    }
}
