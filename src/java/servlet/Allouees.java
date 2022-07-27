/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import autres.autresUtilLocal;
import employe.Employe;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logiciel.logicielUtilLocal;
import memoire.memoireUtilLocal;
import ordinateur.ordiDAOLocal;

/**
 *
 * @author Havila
 */
@WebServlet(name = "Alloues", urlPatterns = {"/Alloues"})
public class Allouees extends HttpServlet {

    @EJB
    private ordiDAOLocal util1;
    @EJB
    private logicielUtilLocal util2;
    @EJB
    private memoireUtilLocal util3;
    @EJB
    private autresUtilLocal util4;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Allouees</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Allouees at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("employe") != null) {
            
            Employe emp= (Employe) request.getSession().getAttribute("employe");
            request.getSession().setAttribute("OrdinateursU", emp.getOrdinateurUtiliseList());
            request.getSession().setAttribute("LogicielsU", emp.getLogicielUtiliseList());
            request.getSession().setAttribute("MemoiresU", emp.getMemoireUtiliseList());
            request.getSession().setAttribute("AutresU", emp.getAutresUtiliseList());
            response.sendRedirect("Allouees.jsp");      
                          
          /*  request.getSession().setAttribute("OrdinateursU", util1.allOrdinateurUtilise());
            request.getSession().setAttribute("LogicielsU", util2.allLogicielUtilise());
            request.getSession().setAttribute("MemoiresU", util3.allMemoireUtilise());
            request.getSession().setAttribute("AutresU", util4.allAutresUtilise());
            response.sendRedirect("Allouees.jsp");*/
            //request.getRequestDispatcher("Ajout.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
