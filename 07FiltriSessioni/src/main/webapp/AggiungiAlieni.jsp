<%-- 
    Document   : AggiungiAlieni
    Created on : 6-apr-2020, 18.08.12
    Author     : giorgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aggiungi Alieni</title>
  </head>
  <body>
    <h1>Crea un nuovo alieno!</h1>
    
    <form action="addAlien" >
      <label>ID: <input type="text" name="id" /> </label>
      <label>Specie: <input type="text" name="species" /> </label>
      <input type="submit" />
    </form>
    
  </body>
</html>
