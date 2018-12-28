<%-- 
    Document   : index
    Created on : Dec 22, 2018, 8:58:41 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login form</title>
    </head>
    <body>
        <h1>Login Authentication</h1>
        <form action="LoginServlet" method="POST">
            username: <input type="text" name="username"/><br>
            password: <input type="password" name="password"/><br>
            <input type="submit" value="Login"/>
            <input type="reset" value="Reset"/>
            
        </form>
    </body>
</html>
