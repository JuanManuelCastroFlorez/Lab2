
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.calculadora.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CALCULADORA</title>");            
            out.println("</head>");
            out.println("<body>");
            String st1 = request.getParameter("t1");
            String st2 = request.getParameter("t2");
            String signo = request.getParameter("action");
            
            int t1;
            int t2;
            t1=Integer.parseInt(st1);
            t2=Integer.parseInt(st2);
            
            out.println("<h1>Solución</h1>");
            
            out.println("<p><strong>Valor 1: </strong>" + st1 + "</p>");
            out.println("<p><strong>Valor 2: </strong>" + st2 + "</p>");
            
            if(signo.equals("+")){
                out.println("<p><strong>la Suma es: </strong></p>" +  calcBean.suma(t1, t2));
            }
            else if(signo.equals("-")){
                out.println("<p><strong>la Resta es: </strong></p>" +  calcBean.resta(t1, t2));
            }
            else if(signo.equals("*")){
            
                out.println("<p><strong>la Multiplicación es: </strong></p>" +  calcBean.multiplicar(t1, t2));
            }
            else {
                signo.equals("/");
                out.println("<p><strong>la División es: </strong></p>" +  calcBean.dividir(t1, t2));
            }
            
            
            
            
            
            
            
            
            
          /*  System.out.println(calcBean);
            out.println("<p><strong>la Suma es: </strong></p>" +  calcBean.suma(t1, t2));
            out.println("<p><strong>la Resta es: </strong></p>" +  calcBean.resta(t1, t2));
            out.println("<p><strong>la Multiplicación es: </strong></p>" +  calcBean.multiplicar(t1, t2));
            out.println("<p><strong>la División es: </strong></p>" +  calcBean.dividir(t1, t2));
          */
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}


