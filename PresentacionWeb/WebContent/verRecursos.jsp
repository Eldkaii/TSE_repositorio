<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver recursos en la base de datos</title>
</head>
<body>

<h3> Ver los Recursos en la base de datos</h3>

<table>
	<tr>
		<th>Codigo</th>
		<th>Cantidad</th>
		<th>Precio Unitario</th>
		<th>Nombre tipo recurso</th>
		<th>Descripcion Tipo de recurso</th>
		<th>Precio Referencia tipo de recurso</th>
	</tr>
	<c:forEach items="${ListaRecursos}" var="recurso">
	<tr>
		<td>${recurso.codigo}</td>
		<td>${recurso.precioUnitario}</td>
		<td>${recurso.cantidad}</td>
		<td>${recurso.nombreTipoRecurso}</td>
		<td>${recurso.descripcionTipoRecurso}</td>
		<td>${recurso.precioReferenciaTipoRecurso}</td>
	</tr>
	</c:forEach>
</table>

<a rel="nofollow" id="enlace" href="/PresentacionWeb/index.jsp" class="automatic">Ir al inicio</a>


</body>
</html>