package test;

import java.sql.Connection;
import java.sql.SQLException;

import datos.CategoriaDAO;
import datos.Conexion;
import domain.Categoria;

public class TestManejoTranzacion {

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            // En caso que falle la conexion, se ejecuta el rollback y se cierra la conexion
            // a la base de datos
            CategoriaDAO categoriaDAO = new CategoriaDAO(conexion);
            
            Categoria nuevaCategoria = new Categoria();
            nuevaCategoria.setID_categoria(6);
            nuevaCategoria.setNombreC("Test Actualizad1o");
            nuevaCategoria.setDescripC("Test Actualizado1");
            categoriaDAO.actualizar(nuevaCategoria);

            Categoria nuevaCategoria2 = new Categoria();
            nuevaCategoria2.setNombreC("Test Actualizado");
            nuevaCategoria2.setDescripC("Test Actualizado");
            categoriaDAO.insertar(nuevaCategoria2);

            // Si no se hace commit no se guardan los cambios en la base de datos
            conexion.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Entramos al rollback");
            try {
                // Si hay un error se hace rollback y no se guardan los cambios en la base de
                // datos
                conexion.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }

        }

    }

}
