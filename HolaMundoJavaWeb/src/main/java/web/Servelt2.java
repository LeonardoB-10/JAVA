
package web;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/Servlet2")
public class Servelt2 extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Leer los parametros del formulario html
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String contrasena = request.getParameter("contrasena");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("correo");
        String sexo = request.getParameter("sexo");
        String paises = request.getParameter("paises");
         String tecnologia[] = request.getParameterValues("tecnologia");
        String descripcion = request.getParameter("descripcion");

        PrintWriter out = response.getWriter();
        out.println("Hola Mundo desde Servlets" + sexo);

        System.out.println("usuario = " + nombre);
        System.out.println("password = " + apellido);

        // para escribir la respuesta al cliente web

        System.out.println(nombre + " - " + apellido);
        System.out.println("contrasena = " + contrasena);
        System.out.println("edad = " + edad);
        System.out.println("correo = " + correo);
        System.out.println("sexo = " + sexo);
        System.out.println("paises = " + paises);
         for (String tc : tecnologia) {
         System.out.println("tecnologia = " + tc);
         }
        System.out.println("descripcion = " + descripcion);

    }

}
