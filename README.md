## Conexion a la base de datos

Configuracion en pom.xml para la conexixion de JAVA

```
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.23</version>
    </dependency>
  </dependencies>

```

**DAO**
DAO es un patron de diseño que permite separar la logica de negocio de la logica de acceso a datos.
Sirve para hacer las consultas a la base de datos y poder utilizarlas en el programa principal.

**Patron de diseño DAO**
El patron de diseño DAO es un patron de diseño que permite separar la logica de negocio de la logica de acceso a datos. <br>

## Buenas practicas de programacion

**Bajo acoplamiento** <br>
El bajo acoplamiento es un principio de diseño que dice que los componentes de un sistema deben estar lo mas desacoplados posible.

**Alta cohesión**<br>
El principio de alta cohesión dice que los componentes de un sistema deben estar lo mas cohesionados posible. <br>

**JAVA Importante** <br>
Se tiene que acostumbrar a trabar con objetos y no por valor ya que los objetos se pasan por referencia y los valores por valor. <br>

## Conexion a la base de datos

Una transacción es un conjunto de operaciones que se ejecutan como una sola unidad. Si una de las operaciones falla, todas las operaciones deben fallar. Si todas las operaciones se completan correctamente, todas las operaciones deben completarse correctamente.

**La practica esta realizada en el proyecto INTRODUCCIONJDBC3** <br>

```
private Connection connTransaccional;
```

## **Revisar como funcina una itnerface en JAVA**

**Como tarea implementar el trazacion en TestConexionPrueba.java** <br>

## Buenas practicas y patrones de deseño

![image](https://user-images.githubusercontent.com/99310007/192063823-5fc9d6d8-9303-42ee-abd7-655819f86a18.png)

## POOL DE CONEXIONES JDBC

Sirve para tener un conjunto de conexiones a la base de datos y que se puedan reutilizar.<br>
Introdcuccion a JDBC 5 POOL DE CONEXIONES JDBC<br>

```
<dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-dbcp2</artifactId>
      <version>2.8.0</version>
</dependency>

En vez de DriverManager se usa getDataSource
En la clase conexion
```

## Servlets y JSP's.
Encargado de la parte web de la aplicacion.
Son clases que se ejecutan en el servidor y que se encargan de generar la respuesta a una peticion de un cliente.

GlassFish 5.0.1 - Full Platform
Link de descargar Glassfish: https://projects.eclipse.org/projects/ee4j.glassfish/downloads

C:\AppServer\glassfish


**Estructura de un servlet**
```
@WebServlet("/Servlet")
public class ServletHolaMundo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
        out.print("Hola mundo desde un servlet");
        out.close();
    }
}
```
**Cabeceros http**<br>
getHeaderNames() -> Obtiene los nombres de los cabeceros http <br>
getHeader(String name) -> Obtiene el valor del cabecero http <br>
getHeaders(String name) -> Obtiene todos los valores del cabecero http <br>


## Curso de Java Fullstack Completo (springboot, hibernate, JWT, API Rest)

Link utilizados:
 https://start.spring.io/ -> Para crear el proyecto de springboot
 https://maven.apache.org/download.cgi -> Para descargar maven
 
 **Ciclo de vida servelt** <br>
 ![ciclovida](https://user-images.githubusercontent.com/99310007/192622886-60a72404-6902-4624-a789-d7cb438ca779.png)
 
 **Capa Web** <br>
 ![servelts](https://user-images.githubusercontent.com/99310007/192622969-dbcb1452-32a8-4874-b67c-788053c181d0.png)


