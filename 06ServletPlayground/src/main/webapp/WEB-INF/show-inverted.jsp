<%-- 
    Document   : show-inverted
    Created on : 2-apr-2020, 18.33.47
    Author     : giorgio
--%>

<%@page import="it.units.progrweb2020.servletplayground.Entities.MessaggioMVC"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Invertitore MVC</title>
  </head>
  <body>
    <h1>Invertitore MVC!</h1>
    <p>Invertita: <strong><%= ((MessaggioMVC) request.getAttribute("invertita")).getStringaInverita()%>  </strong></p>
    <p>Invertita EL: <strong> ${invertita.stringaInverita} </strong></p>

  <c:if test="${invertita.errore}">
    <p>ERRORE! TRAGEDIA!</p>
  </c:if>

  <p>Header a caso: ${header["user-agent"]}</p>
</body>
</html>
