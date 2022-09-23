package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexionPrueba {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/facturacion?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement instruccion = conexion.createStatement();
            var SQL = "SELECT ID_categoria, nombreC, descripC FROM categoria";
            ResultSet resultado = instruccion.executeQuery(SQL);

            while (resultado.next()) {
                System.out.println("ID_categoria: " + resultado.getInt("ID_categoria"));
                System.out.println("nombreC: " + resultado.getString("nombreC"));
                System.out.println("descripC: " + resultado.getString("descripC"));
                System.out.println("--------------------------------------------------");
            }

            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

}
