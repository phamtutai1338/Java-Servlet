<%--
  Created by IntelliJ IDEA.
  User: Tài
  Date: 19/06/2023
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Phone</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>
<div id="container">
    <div id="content">
        <input type="button" value="Add Phone" onclick="window.location.href='add-phone.jsp';return false;" class="add-phone-button"/>

        <table>
            <tr>
                <th> Name</th>
                <th> Brand</th>
                <th> Price </th>
                <th>Description </th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempPhone" items="${PHONE_LIST}">

                <c:url var="tempLink" value="PhoneControllerServlet">
                    <c:param name="command" value="LOAD"/>
                    <c:param name="id" value="${tempPhone.id}"/>
                </c:url>

                <c:url var="deleteLink" value="PhoneControllerServlet">
                    <c:param name="command" value="DELETE"/>
                    <c:param name="id" value="${tempPhone.id}"/>
                </c:url>

                <tr>
                    <td>${tempPhone.name}</td>
                    <td>${tempPhone.brand}</td>
                    <td>${tempPhone.price}</td>
                    <td>${tempPhone.description }</td>
                    <td>

                        <a href="${deleteLink}" class="delete-link" onclick="if(!(confirm('Are you sure you want to delete this phone ?'))) return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
