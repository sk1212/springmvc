<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.06.2014
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<ul>
    <c:forEach var="message" items="${messages}">
        <li>${message}</li>
    </c:forEach>
</ul>
</body>
</html>
