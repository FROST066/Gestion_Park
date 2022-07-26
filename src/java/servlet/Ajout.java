/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import autres.autresUtilLocal;
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
@WebServlet(name = "Ajout", urlPatterns = {"/Ajout"})
public class Ajout extends HttpServlet {

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
            out.println("<title>Servlet Ajout</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ajout at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        if (request.getParameter("categorie") != null) {
            String categorie = request.getParameter("categorie");
            int id = Integer.parseInt(request.getParameter("id"));
            switch (categorie) {
                case "ordinateur" ->
                    util1.addOrdinateurDispo(id);
                case "logiciel" ->
                    util2.addLogicielDispo(id);
                case "memoire" ->
                    util3.addMemoireDispo(id);
                case "autre" ->
                    util4.addAutresDispo(id);
                default -> {
                }
            }
           request.getRequestDispatcher("Ajout.jsp").forward(request, response);
        }
        if (request.getSession().getAttribute("employe") != null) {
            request.getSession().setAttribute("Ordinateurs", util1.allOrdinateur());
            request.getSession().setAttribute("Logiciels", util2.allLogiciel());
            request.getSession().setAttribute("Memoires", util3.allMemoire());
            request.getSession().setAttribute("Autres", util4.allAutres());
            request.getRequestDispatcher("Ajout.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
