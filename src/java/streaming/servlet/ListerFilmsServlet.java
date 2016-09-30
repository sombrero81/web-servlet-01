/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/lister_films"})
public class ListerFilmsServlet extends HttpServlet {

    
    
   // @Override
    //protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        
      // this doGet(req,req) ;
        
    //}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("coucou");
        
        List<Film> films = new FilmService().lister();
        
        req.setAttribute("titre", "TEST LISTE FILMS");//on va utiliser ds la jsp
        req.setAttribute("mesFilms", films);
        req.setAttribute("pied","ceci est le pied de la page @Copyright2016");
        
        req.getRequestDispatcher("lister_films.jsp").forward(req, resp);
    }

   
}
