<%-- 
    Document   : result
    Created on : Dec 12, 2018, 8:16:16 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List products!</h1>
        <a href="search.jsp">Search</a>
        
        <jsp:useBean class="com.wpsj.model.ProductFinderBean" id="finder" scope="request"/>
        
        <table>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                </tr>
            
                <c:forEach items="${finder.products}" var="products">
                <tr>
                    <td><c:out value="${products.id}"/></td>
                    <td><c:out value="${products.name}"/></td>
                    <td><c:out value="${products.desc}"/></td>
                </tr>
                </c:forEach>
            
        </table>

    </body>
</html>
