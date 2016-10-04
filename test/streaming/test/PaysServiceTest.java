/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class PaysServiceTest {
    
   @Before
   public void setup(){
       
       //vider ttes les tables
       
       //remplir mes pays uk 1, france 2,usa 3
   }
   
   
   @Test
   public void modifierok(){
       
       Pays p = new Pays();
       p.setId(1L);
       p.setNom("united kingdom");
       
       //oubien
      // Pays p = new PaysService().chercher(1L);
      // p.setNom("united kingdom");
       
       new PaysService().modifier(p);
       
   }
   
   @Test
   public void ajouterko(){
       
       Pays p = new Pays();
       p.setId(3L);
       new PaysService().ajouter(p);
   }
   
   @Test
   public void ajouterok(){
       
       Pays p = new Pays();
       p.setNom("Italia");
       new PaysService().ajouter(p);
   }
   
   @Test
   public void chercherok(){
       
       Pays p = new PaysService().findById(2L);
       
       Assert.assertEquals("France", p.getNom());
   }
    
    
}
