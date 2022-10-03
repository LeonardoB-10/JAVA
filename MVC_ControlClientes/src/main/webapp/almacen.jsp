<%-- Document : almacen Created on : Sep 30, 2022, 12:20:36 PM Author : VINICIO
BORJA --%> <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <script
      src="https://kit.fontawesome.com/0ea7a89597.js"
      crossorigin="anonymous"
    ></script>
    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
      crossorigin="anonymous"
    />
    <title>Control de almacenes</title>
  </head>
  <body>
    <header id="main-header" class="py-2 bg-info text-white">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h1><i class="fas fa-cog"></i>Control de Clientes</h1>
          </div>
        </div>
      </div>
    </header>


    <section id="actions" class="py-4 mb-4 gb-light">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <a
              href="#"
              class="btn btn-primary btn-block"
              data-toggle="modal"
              data-target="#agregarClienteModal"
              ><i class="fas fa-plus"></i>Agregar Cliente</a
            >
          </div>
        </div>
      </div>
    </section>

    <jsp:include page="WEB-INF/cliente/listadoAlmacen.jsp" />
    

    <footer id="pie-pagina" class="bg-warning text-white mt-5 p-5">
      <div class="container">
        <div class="col">
          <p class="lead text-center">Todos los derechos reservados</p>
        </div>
      </div>
    </footer>

    <script
      src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
      integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
      integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
