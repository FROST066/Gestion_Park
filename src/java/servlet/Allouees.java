/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import employe.Employe;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Havila
 */
@WebServlet(name = "Alloues", urlPatterns = {"/Alloues"})
public class Allouees extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("employe") != null) {

            Employe emp = (Employe) request.getSession().getAttribute("employe");
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
