<%-- 
    Document   : variables
    Created on : Sep 29, 2022, 10:51:55 PM
    Author     : VINICIO BORJA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Despliegue de variables!</h1>
        <br>
        Variable en alcance request: ${mensaje}
        <br>
        <br>
        Variable se session
        <br><!-- comment -->
         <br><!-- comment -->
        Retangulo:
        <br>
        Base: ${retangulo.base}
        <br>
        Altura: ${retangulo.altura}
        <br><!-- comment -->
        Resultado: ${retangulo.areaRetangulo()}
        <br> 
        <a href="${pageContext.request.contextPath}">Regresar</a>
    </body>
</html>
