<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, model.Cliente , model.Modalidade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show</title>
</head>
<body>
<center>
<table width="100%" border="1" cellpadding="0" cellspacing="0" align="center">
<tr>
<th width="5%">ID</th>
<th width="25%">Nome</th>
<th width="15%">Contacto</th>
<th width="55%">Modalidades</th>
</tr>

<%
	ArrayList ar = (ArrayList) request.getAttribute("lista");

	for(int i=0; i<ar.size(); i++){
		Cliente c = (Cliente) ar.get(i);
		out.append("<tr><td>"+ c.getID() +"</td><td>" + c.getNome() + "</td><td>"+ c.getContacto() +"</td><td>"+ c.getArMod() +"</td></tr>");
	}

%>
</table>
</center>
</body>
</html>