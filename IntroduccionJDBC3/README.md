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
El patron de diseño DAO es un patron de diseño que permite separar la logica de negocio de la logica de acceso a datos.

## Buenas practicas de programacion

**Bajo acoplamiento**
El bajo acoplamiento es un principio de diseño que dice que los componentes de un sistema deben estar lo mas desacoplados posible.

**Alta cohesión**
El principio de alta cohesión dice que los componentes de un sistema deben estar lo mas cohesionados posible.

**JAVA Importante**
Se tiene que acostumbrar a trabar con objetos y no por valor ya que los objetos se pasan por referencia y los valores por valor.

## Conexion a la base de datos 

Una transacción es un conjunto de operaciones que se ejecutan como una sola unidad. Si una de las operaciones falla, todas las operaciones deben fallar. Si todas las operaciones se completan correctamente, todas las operaciones deben completarse correctamente.

**La practica esta realizada en el proyecto INTRODUCCIONJDBC3**
```
private Connection connTransaccional;
```

**Como tarea implementar el trazacion en TestConexionPrueba.java**
