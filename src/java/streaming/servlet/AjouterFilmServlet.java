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
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

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
        
        //option1 pas bien
       // f.setGenre(new Genre());
        //f.getGenre().setId(Long.valueOf(req.getParameter("genreID")));
       // f.getGenre().getFilms().add(f);
        
       
       //option2 clean
       long idGenre = Long.valueOf(req.getParameter("genreID"));
       Genre g =new GenreService().findbyId(idGenre);
       f.setGenre(g);
       g.getFilms().add(f);
       
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
        
        
        List<Genre> genres = new GenreService().lister();
        req.setAttribute("listeGenres", genres);
                
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
        
    }

}
