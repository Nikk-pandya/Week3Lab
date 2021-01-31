
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

public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
              forward(request, response);
    }

      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String age = request.getParameter("theAge");
          
             request.setAttribute("theAge",age);
          
        
        if (age == null || age.equals(""))
        { 
            request.setAttribute("message", "Invalid Entry. Please enter a current age");
              getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
              forward(request, response);
              return;
        }
        try {
         
            request.setAttribute("message", "Your age on next birthday is " + (Integer.parseInt(age) +1));
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        }
        
        catch (NumberFormatException e)
        {
            request.setAttribute("message", "Enter a Valid Number");
                  getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        }
               
  
    }
}
