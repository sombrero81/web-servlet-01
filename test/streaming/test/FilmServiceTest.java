/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class FilmServiceTest {
    
   
    @Test
    public void ajoutok(){
        Film f = new Film();
        
        f.setAnnee(1999);
        f.setDuree(100);
        f.setTitre("terminator");
        
        new FilmService().ajouterFilm(f);
        
        
    }
    
    @Test
    public void modifok(){
        
        Film f=new Film();
        f.setId(1L);
        f.setAnnee(1969);
        
        new FilmService().modifierFilm(f);
        
    }
    
    @Test
    
    public void supprok(){
        
        new FilmService().supprimerFilm(1L);
    }
    
    @Test
    public void rechercheok(){
        
        new FilmService().rechercheParId(2L);
    }
    
    @Test
    public void listerok(){
        
        new FilmService().lister();
    }
}
