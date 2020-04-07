<%-- 
    Document   : SafeData
    Created on : 7-apr-2020, 18.26.30
    Author     : giorgio
--%>

<%@page import="com.google.appengine.api.users.User"%>
<%@page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@page import="com.google.appengine.api.users.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>Benvenuto <%=request.getUserPrincipal().getName()%></p>
    
    <%
      UserService userService = UserServiceFactory.getUserService();
      User user = userService.getCurrentUser();
      %>
      <p>Utente google: <%=user.getNickname()%></p>
  </body>
</html>
