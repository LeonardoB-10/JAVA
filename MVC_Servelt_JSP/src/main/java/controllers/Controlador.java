/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import web.Retangulo;

/**
 *
 * @author VINICIO BORJA
 */
@WebServlet("/ServeltControlador")
public class Controlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Proceso de parametro

        //2. Creamos los javaBeans
        Retangulo ret = new Retangulo(20.10, 15);

        //3. Se agrega en el javaBean el alcance 
        request.setAttribute("mensaje", "Saludos desde el Servelt");

        HttpSession session = request.getSession();
        session.setAttribute("retangulo", ret);

        //4. Redirrecionamos a la vista
        RequestDispatcher rd = request.getRequestDispatcher("/vista/variables.jsp");
        rd.forward(request, response);
       
    }
}
