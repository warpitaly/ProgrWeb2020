<%-- 
    Document   : SelfUpdating
    Created on : 3-apr-2020, 17.53.14
    Author     : giorgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Io mi auto aggiorno!</title>
    <script type="text/javascript" src="jquery-3.4.1.min.js"></script>
  </head>
  <body>
    <h1>Che bello auto aggiornarsi</h1>
    
    <table>
      <thead>
        <tr>
          <th>Mittente</th>
          <th>Oggetto</th>
          <th>Quando</th>
        </tr>
      </thead>
      <tbody id="updatableBody">
        <jsp:include page="/WEB-INF/SelfUpdatingPartial.jsp"/>
      </tbody>
    </table>
    
    
    <script>
      window.setInterval(function(){
        $("#updatableBody").load("?partial");
      }, 10000);
      
    </script>
    
  </body>
</html>
