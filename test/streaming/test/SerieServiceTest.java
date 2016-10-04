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
        
        new SerieService().ajouterSerie(s);
        
    }
    
}
