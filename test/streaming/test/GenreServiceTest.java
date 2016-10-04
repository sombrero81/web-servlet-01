/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Genre;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
public class GenreServiceTest {
    
    @Test
    public void ajoutgenreok(){
        
        Genre g  = new Genre();
        g.setId(5L);
        g.setNom("genre guerre");
        
        new GenreService().ajouter(g);
    }
    
    /**
     *
     */
    @Test    
    public void modifgenretestok(){
        
        Genre g = new Genre();
        g.setId(5L);
        g.setNom("genrebidon");
        
        new GenreService().modifier(g);
    }
    
    @Test
    public void suppressiongenretestok(){
        
        new GenreService().supprimer(5L);
    }
    
    @Test
    public void recherchegenretestok(){
        
        new GenreService().findbyId(10L);
    }
    
    @Test
    public void listergenretestok(){
        
        new GenreService().lister();
    }
    
    
}
