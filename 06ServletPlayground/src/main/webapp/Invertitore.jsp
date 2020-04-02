<%-- 
    Document   : Invertitore
    Created on : 2-apr-2020, 18.13.54
    Author     : giorgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP inverter</title>
  </head>
  <body>
    <h1>Inverto JSP!</h1>

    <%
      String ricevuta = request.getParameter("invertimi");
      if (ricevuta != null) {
        String invertita = "";
        for (int i = ricevuta.length() - 1; i >= 0; i--) {
          invertita += ricevuta.charAt(i);
        }
    %>

    <p>Invertita: <strong><%= invertita%></strong></p>
    <% } else{ %>
    <p>Errore!!!</p>
    <%}%>

  </body>
</html>
