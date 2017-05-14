<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, model.Modalidade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>
<body>
<form action="HCliente" method="post">
	<b>Nome:</b> <input type="text" name="nome_c">
	<b>Contacto:</b> <input type="text" name="cont_c">
	<br>
	<b>Modalidades:</b>
	<%
		ArrayList<Modalidade> ar = (ArrayList) request.getAttribute("listaM");
	
		for(Modalidade m : ar){
			out.append("<input type='checkbox' name='mod_c' value="+ m.getNome() +">"+m.getNome());
		}
	%>
	<br>
	<input type="submit" name="add_c" value="Adicionar">
</form>
</body>
</html>