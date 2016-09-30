/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "DeleteSerieServlet", urlPatterns = {"/supprimer_serie"})
public class DeleteSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        long id=Long.valueOf(req.getParameter("monId"));
        new SerieService().supprimerSerie(id);
        resp.sendRedirect("lister_series");
    }

    
}
