
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
            if(request.getParameter("add") != null){
             int answer = Integer.valueOf(first) + Integer.valueOf(second);
             request.setAttribute("message", answer);
             request.setAttribute("First", first);
             request.setAttribute("Second", second);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
          }
            
            else if (request.getParameter("minus") != null){
             int answer = Integer.valueOf(first) - Integer.valueOf(second);
            request.setAttribute("message", answer);
            request.setAttribute("First", first);
            request.setAttribute("Second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
          }
             
            else if (request.getParameter("multiply") != null){
            int answer = Integer.valueOf(first) * Integer.valueOf(second);
            request.setAttribute("message", answer); 
            request.setAttribute("First", first);
            request.setAttribute("Second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
          }
              
           else if (request.getParameter("modulus") != null){
            int answer = Integer.valueOf(first) % Integer.valueOf(second);
            request.setAttribute("message", answer); 
            request.setAttribute("First", first);
            request.setAttribute("Second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
          return;
          }
   
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
          
  
    }
}
