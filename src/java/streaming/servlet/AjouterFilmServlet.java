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
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //cree noueveau film et le remplit avec des donnees entres par
        // le user dans le formulaire
        Film f = new Film();
        f.setTitre( req.getParameter("titre"));
        f.setSynopsis(req.getParameter("synopsis"));
        f.setAnnee(Integer.valueOf(req.getParameter("annee")));
        f.setDuree(Integer.valueOf(req.getParameter("duree")));
        //ajout
        new FilmService().ajouterFilm(f);
        
        
        //initialise attribut mesfilms pour la jsp
       // List<Film> films = new FilmService().lister();
       // req.setAttribute("mesFilms", films);
        
       //forward vers liste film
        //req.getRequestDispatcher("lister_films").forward(req, resp);
        
        //redirect vers liste film
        resp.sendRedirect("lister_films");
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
        
    }

}
