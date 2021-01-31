
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 829364
 */

public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        request.setAttribute("message", "--");
      
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String first = request.getParameter("theFirst");
         String second = request.getParameter("theSecond");
         
         
         
         
          if (first == null || first.equals("")) 
          {
            request.setAttribute("message", "Invalid Entry, Enter a Number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") .forward(request, response);
            return;
         
         }
          
           if (second == null || second.equals("")) 
          {
            request.setAttribute("message", "Invalid Entry, Enter a Number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") .forward(request, response);
            return;
         
         }
            if ("+".equals(request.getParameter("submit"))){
             int answer = Integer.parseInt(first) + Integer.parseInt(second);
             request.setAttribute("message", answer);
             request.setAttribute("theFirst", first);
             request.setAttribute("theSecond", second);
        
          }
            
            else if ("-".equals(request.getParameter("submit"))){
             int answer = Integer.parseInt(first) - Integer.parseInt(second);
            request.setAttribute("message", answer);
            request.setAttribute("theFirst", first);
            request.setAttribute("theSecond", second);
        
          }
             
            else if ("*".equals(request.getParameter("submit"))){
            int answer = Integer.parseInt(first) * Integer.parseInt(second);
            request.setAttribute("message", answer); 
            request.setAttribute("theFirst", first);
            request.setAttribute("theSecond", second);
        
          }
              
           else if ("%".equals(request.getParameter("submit"))){
            int answer = Integer.parseInt(first) % Integer.parseInt(second);
            request.setAttribute("message", answer); 
            request.setAttribute("theFirst", first);
            request.setAttribute("theSecond", second);
        
          }
   
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
          
  
    }
}