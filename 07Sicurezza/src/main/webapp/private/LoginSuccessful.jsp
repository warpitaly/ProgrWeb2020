<%-- 
    Document   : LoginSuccessful
    Created on : 7-apr-2020, 18.01.57
    Author     : giorgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pagina Segreta</title>
  </head>
  <body>
    <h1>Sei un utente connesso!</h1>
    <p>Benvenuto ${sessionScope.user} </p>
    
    <form action="/Logout" method="post">
      <input type="submit" value="Logout"/>
    </form>
    
  </body>
</html>
