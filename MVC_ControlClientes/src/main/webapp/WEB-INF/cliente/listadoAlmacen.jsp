<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_MX"/>

<section id="clientes">
  <div class="container">
    <div class="row">
      <div class="col-md-9">
        <div class="card">
          <div class="card-header">
            <h4>Almacen</h4>
          </div>
          <table class="table table-striped">
            <thead class="thead-dark">
              <tr>
                <th>#</th>
                <th>Categoria</th>
                <th>Precio unitario</th>
                <th></th>
                <th></th>

              </tr>
            </thead>
            <tbody>
              <c:forEach var="almacen" items="${almacenes}">
                <tr>
                  <td>${almacen.codigo}</td>
                  <td>${almacen.nombre}</td>
                  <td><fmt:formatNumber value="${almacen.costo_produccion}" type="currency"/></td>

                  <td></td>

                  <td>
                    <a href="${pageContext.request.contextPath}/ServeltControlador?accion=editar&idAlmacen=${almacen.codigo}" class="btn btn-secondary">
                      <i class="fas fa-angle-double-right"></i> Editar
                    </a>
                  </td>
                </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>

      <div class="col-md-3">
        <div class="card text-center bg-danger text-white mb-3">
          <h4 class="display-4">
            <td><fmt:formatNumber value="${cacularTotal}" type="currency"/> </td>
          </h4>
        </div>
        <div class="card text-center bg-success text-white mb-3">
          <h4 class="display-4">
            <i class="fas fa-users"></i>${totalAlmacen}
          </h4>
        </div>
      </div>
    </div>
  </div>
</section>


<div class="modal fade" id="agregarClienteModal">
  <div class="modal-dialog modal-lg">
      <div class="modal-content">
          <div class="modal-header bg-info text-white">
              <h5 class="modal-title">Agregar Cliente</h5> 
              <button class="close" data-dismiss="modal">
                  <span>&times;</span>
              </button>
          </div>
          <form action="${pageContext.request.contextPath}/ServeltControlador?accion=insertar"
                method="POST" class="was-validated">
              
              <div class="modal-body">
                  <div class="form-group">
                      <label for="nombre">Nombre</label>
                      <input type="text" class="form-control" name="nombre" required>
                  </div>
                  <div class="form-group">
                      <label for="descripcion">descripcion</label>
                      <input type="text" class="form-control" name="descripcion" required>
                  </div>
                  <div class="form-group">
                      <label for="precio">precio</label>
                      <input type="text" class="form-control" name="precio" required>
                  </div>
                  <div class="form-group">
                      <label for="costo">costo</label>
                      <input type="text" class="form-control" name="costo" required>
                  </div>
                  <div class="form-group">
                      <label for="fecha">fecha elavaracion</label>
                      <input type="date" class="form-control" name="fecha" required>
                  </div>
              </div>
              <div class="modal-footer">
                  <button class="btn btn-primary" type="submit">Guardar</button>
              </div>    
          </form>
      </div>
  </div>
</div>