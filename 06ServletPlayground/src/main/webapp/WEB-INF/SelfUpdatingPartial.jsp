<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:forEach var="message" items="${messaggi}">
  <tr>
    <td>${message.mittente}</td>
    <td>${message.oggetto}</td>
    <td>${message.quando}</td>
  </tr>
  
</c:forEach>