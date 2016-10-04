/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streamin.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysService {
    
    
    public void ajouter(Pays p){
        
        new PaysDAO().ajouterPays(p);
    }
    
    public void modifier(Pays p){
        
        new PaysDAO().modifierPays(p);
    }
    
    public void supprimer(long id){
        
        new PaysDAO().supprimerPays(id);
    }
            
    public List<Pays> lister(){
        
        PaysDAO dao=new PaysDAO();
        return dao.listerPays();
    }
    
    public Pays findById(long id){
        
        return new PaysDAO().recherchePaysbyId(id);
    }
    
}
