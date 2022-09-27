/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author VINICIO BORJA
 */
@WebServlet("/Servlet")
public class Servelt extends HttpServlet {

    @Override // doPost es un metodo de la clase HttpServlet POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Leer los parametros del formulario html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        // para escribir la respuesta al cliente web
        PrintWriter out = response.getWriter();

        System.out.println(usuario + " - "+password);
    }

}
