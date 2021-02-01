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
            Second: <input type="text" name ="theSecond" value="${Second}"><br>
            <input type="submit" value="+" name = "add">
             <input type="submit" value="-" name = "minus">
              <input type="submit" value="*" name = "multiply">
               <input type="submit" value="%" name = "modulus">
                <p>${message}</p>
        </form>
           
            
            <a href="age">Age Calculator</a>
    </body>
    
</html>
