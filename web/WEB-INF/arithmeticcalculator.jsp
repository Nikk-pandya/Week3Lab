<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 30, 2021, 5:14:03 AM
    Author     : 829364
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
         <form method="post" action="arithmetic">
            First: <input type="text" name ="theFirst" value="${First}"><br>
            Second: <input type="text" name ="theFirst" value="${Second}"><br>
            <input type="submit" value="+" name = "submit">
             <input type="submit" value="-" name = "submit">
              <input type="submit" value="*" name = "submit">
               <input type="submit" value="%" name = "submit">
        </form>
            <p>${message}</p>
            
            <a href="age">Age Calculator</a>
    </body>
    
</html>
