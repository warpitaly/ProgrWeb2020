<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <body>
    <h1>My First JSP Page</h1>
    Hello! The time is now <%= new java.util.Date()%>!
    <ul>
      <% for (int i = 0; i < 5; i++) {%>
      <li>numero <%= i + 1%></li>
        <% }%>
    </ul>
  </body>
</html>
