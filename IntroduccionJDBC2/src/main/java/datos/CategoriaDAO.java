package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Categoria;

public class CategoriaDAO {

	private static final String SQL_SELECT = "SELECT ID_categoria, nombreC, descripC FROM categoria";
	private static final String SQL_INSERT = "INSERT INTO categoria(nombreC, descripC) VALUES(?,?)";
	private static final String SQL_UPDATE = "UPDATE categoria SET nombreC=?, descripC=? WHERE ID_categoria=?";
	private static final String SQL_DELETE = "DELETE FROM categoria WHERE ID_categoria=?";

	public List<Categoria> seleccionar() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Categoria categoria = null;
		List<Categoria> categorias = new ArrayList<>();

		try {
			conn = Conexion.getConnection();
			// se prepara la consulta a la base de datos y se guarda en stmt
			stmt = conn.prepareStatement(SQL_SELECT);
			// se ejecuta la consulta y se guarda en rs
			rs = stmt.executeQuery();
			// mientras haya registros en rs
			while (rs.next()) {
				// Recuperamos las variables
				int idCategoria = rs.getInt("ID_categoria");
				String nombreC = rs.getString("nombreC");
				String descripC = rs.getString("descripC");
				categoria = new Categoria(idCategoria, nombreC, descripC);
				categorias.add(categoria);
			}
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				// cerramos la conexion a la base de datos
				// Los metodos close de la clase Conexion son estaticos por eso se puede llamar
				// asi
				Conexion.close(rs);
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return categorias;
	}

	public int insertar(Categoria categoria) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			// se sustituyen los signos de interrogacion por los valores de las variables de
			// la clase
			stmt.setString(1, categoria.getNombreC());
			stmt.setString(2, categoria.getDescripC());
			rows = stmt.executeUpdate();
			/*
			 * se ejecuta la consulta y se guarda en rows el numero de filas afectadas por
			 * la consulta
			 * a la base de datos (1) o 0 si no se ha afectado ninguna fila (no se ha
			 * insertado nada)
			 * o -1 si ha habido un error en la consulta a la base de datos (no se ha
			 * insertado nada)
			 */
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int actualizar(Categoria categoria) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			// se sustituyen los signos de interrogacion por los valores de las variables de
			// la clase
			stmt.setString(1, categoria.getNombreC());
			stmt.setString(2, categoria.getDescripC());
			stmt.setInt(3, categoria.getID_categoria());// -> En caso que fuera un tipo de dato int
			rows = stmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int eliminar(Categoria categoria) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, categoria.getID_categoria());// -> En caso que fuera un tipo de dato int
			rows = stmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

}
