/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import web.Conexion;

/**
 *
 * @author VINICIO BORJA
 */
public class AlmacenDao {
    // Tambien se puede crer una interfce

    private static final String SQL_SELECT = "SELECT codigo, nombre, descripcion, precio_unitairo, costo_produccion, fecha_elaboracion FROM productos";

    private static final String SQL_SELECT_BY_ID = "SELECT codigo, nombre, descripcion, precio_unitairo, costo_produccion, fecha_elaboracion FROM productos WHERE codigo = ?";

    private static final String SQL_INSERT = "INSERT INTO productos(nombre, descripcion, precio_unitairo, costo_produccion, fecha_elaboracion) VALUES(?,?,?,?,?)";

    private static final String SQL_UDATE = "UPDATE productos SET nombre= ?,descripcion= ?,precio_unitairo= ?,costo_produccion= ?,fecha_elaboracion= ? WHERE codigo = ?";

    private static final String SQL_DELETE = "DELETE FROM productos WHERE codigo = ?";

    public List<Almacen> listar() {

        // try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // } catch (Exception e) {
        // e.printStackTrace(System.out);
        // }
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Almacen almacen = null;
        List<Almacen> almacenes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                double precio_unitairo = rs.getDouble("precio_unitairo");
                double costo_produccion = rs.getDouble("costo_produccion");
                String fecha_elaboracion = rs.getString("fecha_elaboracion");

                almacen = new Almacen(codigo, nombre, descripcion, precio_unitairo, costo_produccion,
                        fecha_elaboracion);
                almacenes.add(almacen);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return almacenes;
    }

    public Almacen encontrar(Almacen almacen) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // Almacen almacen = null;
        // List<Almacen> almacenes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            // El 1 significa la cantidad de parametros
            stmt.setInt(1, almacen.getCodigo());

            // Se ejecuta el query
            rs = stmt.executeQuery();

            // En caos que exista un registro se ubica en la primera posicion
            rs.next();
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            double precio_unitairo = rs.getDouble("precio_unitairo");
            double costo_produccion = rs.getDouble("costo_produccion");
            String fecha_elaboracion = rs.getString("fecha_elaboracion");

            System.out.println("nombre: " + nombre);
            // Se actualiza los datos
            almacen.setCosto_produccion(costo_produccion);
            almacen.setDescripcion(descripcion);
            almacen.setFecha_elaboracion(fecha_elaboracion);
            almacen.setPrecio_unitairo(precio_unitairo);
            almacen.setNombre(nombre);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return almacen;
    }

    public int insertar(Almacen almacen) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        // No se ocupa la clase ResultSet por motico que no se recupera informacino
        ResultSet rs = null;
        // Almacen almacen = null;
        // List<Almacen> almacenes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, almacen.getNombre());
            stmt.setString(2, almacen.getDescripcion());
            stmt.setDouble(3, almacen.getPrecio_unitairo());
            stmt.setDouble(4, almacen.getCosto_produccion());
            stmt.setString(5, almacen.getFecha_elaboracion());

            // Cantidad de registros ingresados o modificados
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizar(Almacen almacen) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        // No se ocupa la clase ResultSet por motico que no se recupera informacino
        // Almacen almacen = null;
        // List<Almacen> almacenes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UDATE);
            stmt.setString(1, almacen.getNombre());
            stmt.setString(2, almacen.getDescripcion());
            stmt.setDouble(3, almacen.getPrecio_unitairo());
            stmt.setDouble(4, almacen.getCosto_produccion());
            stmt.setString(5, almacen.getFecha_elaboracion());
            stmt.setInt(6, almacen.getCodigo());

            // Cantidad de registros ingresados o modificados
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int eliminar(Almacen almacen) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        // No se ocupa la clase ResultSet por motico que no se recupera informacino
        ResultSet rs = null;
        // Almacen almacen = null;
        // List<Almacen> almacenes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, almacen.getCodigo());

            // Cantidad de registros ingresados o modificados
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
}
