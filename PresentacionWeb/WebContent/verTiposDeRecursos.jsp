<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Tipos de Recursos en la Base De Datos</title>
</head>
<body>
	<h3> Ver los Tipos de Recursos en la base de datos</h3>


	<table>
		<tr>
			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Precio Referencia</th>
		
		</tr>
		<c:forEach items="${ListaTiposDeRecursos}" var="tipoDerecurso">
		<tr>
			<td>${tipoDerecurso.nombre}</td>
			<td>${tipoDerecurso.descripcion}</td>
			<td>${tipoDerecurso.precioReferencia}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	
	<a rel="nofollow" id="enlace" href="/PresentacionWeb/index.jsp" class="automatic">Ir al inicio</a>
</body>
</html>