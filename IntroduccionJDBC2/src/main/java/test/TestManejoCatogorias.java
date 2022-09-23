package test;

import java.util.List;

import datos.CategoriaDAO;
import domain.Categoria;

public class TestManejoCatogorias {

    public static void main(String[] args) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        // seleccionar es un metodo de la clase CategoriaDAO que devuelve una lista de
        // objetos de tipo Categoria
        // Se guarda en una lista de objetos de tipo Categoria la lista que devuelve el
        // metodo seleccionar de la clase CategoriaDAO
        List<Categoria> categorias = categoriaDAO.seleccionar();

        // for (Categoria categoria : categorias) {
        // System.out.println("categoria = " + categoria);
        // }

        categorias.forEach(categoria -> {
            System.out.println("categoria = " + categoria);
        });

        // Insertar un nuevo objeto de tipo Categoria
        // Categoria nuevaCategoria = new Categoria("Test", "Test");
        // categoriaDAO.insertar(nuevaCategoria);

        // Modificar un objeto de tipo Categoria
        // Categoria updateCategoria = new Categoria(3, "Test2", "Test2");
        // categoriaDAO.actualizar(updateCategoria);

        // Eliminar un objeto de tipo Categoria
        Categoria deleteCategoria = new Categoria(5);
        categoriaDAO.eliminar(deleteCategoria);

        System.out.println("------------------");
        categorias.forEach(categoria -> {
            System.out.println("categoria = " + categoria);
        });
    }

}
