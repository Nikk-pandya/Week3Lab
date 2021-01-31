<%-- 
    Document   : agecalculator
    Created on : Jan 29, 2021, 2:02:10 AM
    Author     : 829364
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator </title>
    </head>
    <body>
        <h1>Working Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name ="theAge" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
