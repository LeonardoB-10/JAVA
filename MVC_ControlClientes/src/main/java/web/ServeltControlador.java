/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import dominio.Almacen;
import dominio.AlmacenDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author VINICIO BORJA
 */
@WebServlet("/ServeltControlador")
public class ServeltControlador extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarAlmacen(req, resp);
                    break;
                case "eliminar":
                    this.eliminarAlmacen(req, resp);
                    break;

                default:
                    this.accionDefault(req, resp);
            }
        } else {
            this.accionDefault(req, resp);
        }
    }

    private void accionDefault(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Almacen> almacen = new AlmacenDao().listar();
        System.out.println("almacen = " + almacen);
        System.out.println("almacen: " + almacen);
        HttpSession sesion = req.getSession();
        sesion.setAttribute("totalAlmacen", almacen.size());
        sesion.setAttribute("cacularTotal", this.cacularTotal(almacen));
        sesion.setAttribute("almacenes", almacen);// Con eso se recupera en el foreach
        // req.getRequestDispatcher("almacen.jsp").forward(req, resp);
        resp.sendRedirect("almacen.jsp");
    }

    private double cacularTotal(List<Almacen> almacen) {
        double total = 0;
        for (Almacen almacen1 : almacen) {
            total += almacen1.getPrecio_unitairo();
        }
        return total;
    }

    private void editarAlmacen(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int idAlmacen = Integer.parseInt(req.getParameter("idAlmacen"));
        Almacen almacen = new AlmacenDao().encontrar(new Almacen(idAlmacen));
        // Muy imporante **alamcen** ya que envia la variable del objeto al editar.jsp
        // para recuperar la info del fomrulario
        req.setAttribute("almacen", almacen);
        String jspEditar = "/WEB-INF/cliente/editarAlmacen.jsp";
        req.getRequestDispatcher(jspEditar).forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Se recupera el parametro accion
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarAlmacen(req, resp);
                    break;
                case "modificar":
                    this.modificarAlmacen(req, resp);
                    break;

                default:
                    this.accionDefault(req, resp);
                    break;
            }
        } else {
            this.accionDefault(req, resp);
        }

    }

    private void insertarAlmacen(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Se recupera los parametros del formulario
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        String precio_unitario = req.getParameter("precio");
        String costo = req.getParameter("costo");
        String fecha = req.getParameter("fecha");
        // Se crea el objeto Almacen
        Almacen almacen = new Almacen(nombre, descripcion, Double.parseDouble(precio_unitario),
                Double.parseDouble(costo), fecha);
        // Se inserta el nuevo objeto Almacen en la base de datos
        int registrosModificados = new AlmacenDao().insertar(almacen);
        System.out.println("registrosModificados = " + registrosModificados);
        // Se redirecciona hacia accion por default
        this.accionDefault(req, resp);
    }

    private void modificarAlmacen(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Se recupera los parametros del formulario
        int idAlmacen = Integer.parseInt(req.getParameter("idAlmacen"));
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        String precio_unitario = req.getParameter("precio");
        String costo = req.getParameter("costo");
        String fecha = req.getParameter("fecha");
        // Se crea el objeto Almacen
        Almacen almacen = new Almacen(idAlmacen, nombre, descripcion, Double.parseDouble(precio_unitario),
                Double.parseDouble(costo), fecha);
        // Se inserta el nuevo objeto Almacen en la base de datos
        int registrosModificados = new AlmacenDao().actualizar(almacen);
        System.out.println("registrosModificados = " + registrosModificados);
        // Se redirecciona hacia accion por default
        this.accionDefault(req, resp);
    }

    private void eliminarAlmacen(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Se recupera los parametros del formulario
        int idAlmacen = Integer.parseInt(req.getParameter("idAlmacen"));
        // Se crea el objeto Almacen
        Almacen almacen = new Almacen(idAlmacen);
        // Se inserta el nuevo objeto Almacen en la base de datos
        int registrosModificados = new AlmacenDao().eliminar(almacen);
        System.out.println("registrosModificados = " + registrosModificados);
        // Se redirecciona hacia accion por default
        this.accionDefault(req, resp);
    }
}
