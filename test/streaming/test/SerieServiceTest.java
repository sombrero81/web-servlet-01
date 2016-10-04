/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
public class SerieServiceTest {
    
    @Test
    public void ajouterserieok(){
    
        Serie s = new Serie();
        s.setTitre("serietest");
        
        new SerieService().ajouter(s);
        
    }
    
    @Test
    public void modifserieok(){
        
        Serie s =new Serie();
        s.setId(10L);
        s.setTitre("seriebidon");
        
        new SerieService().modifier(s);
    }
    
    @Test
    public void suppressionserieok(){
        
        new SerieService().supprimer(10L);
    }
    
    @Test
    public void chercheserieok(){
        
        new SerieService().findbyId(1L);
    }
    
    @Test
    public void listerserietestok(){
        
        new SerieService().lister();
    }
    
}
