<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Web</title>
</head>
<body>
	<h1>Funciones Disponibles</h1>

	<h3>Ver tipos de recursos disponibles</h3>
	<form action="TiposDeRecursosServlets" method="get">
	<input type="submit" value="Ver Tipos De Recursos">	
	</form>
	<br>
	<br>
	
	<h3>Ver recursos disponibles</h3>
	<form action="agregarRecurso" method="get">
	<input type="submit" value="Ver Recursos">	
	</form>
	<br>
	<br>
	
	<h3>Agregar un recurso</h3>
	<form action="agregarRecurso" method="post">
	<label>Codigo Recurso:</label>
	<input type="text" name="codigoRecurso"> <br>
	<label>Precio Unitario Recurso:</label>
	<input type="text" name="precioUnitarioRecurso"> <br>
	<label>Cantidad del Recurso:</label>
	<input type="text" name="cantidadRecurso"> <br>
	<label>Nombre del Tipo deRecurso:</label>
	<input type="text" name="tipoRecurso"> <br>
	<input type="submit" value="Agregar Recurso">	
	</form>
	<br>
	<br>
	
		<h3>Ver recursos de un tipo disponibles</h3>
	<form action="TiposDeRecursosServlets" method="post">
	<label>Nombre del tipo de recurso:</label>
	<input type="text" name="nombreTipoDeRecurso"> <br>
	<input type="submit" value="Ver Recursos">	
	</form>
	<br>
	<br>
	
</body>
</html>