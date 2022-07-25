
package servlet;

import autres.autresUtilLocal;
import ordinateur.ordiDAOLocal;
import jakarta.ejb.EJB;
import java.io.IOException;;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "NewServlet", urlPatterns = {"/"})
public class NewServlet extends HttpServlet {
@EJB
private  ordiDAOLocal util;
@EJB
private autresUtilLocal util2;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom=request.getParameter("name");
        String prenom=request.getParameter("surname");
        int age=Integer.parseInt(request.getParameter("old")); 
        //util.addOrdinateurUtilise(1, 1);
        //System.out.println(util.loadOrdinateurDispoByID(age).getOrdinateur());
        util2.addAutres(nom, prenom);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.getSession().invalidate();
        response.sendRedirect("index.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
