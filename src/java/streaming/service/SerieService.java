/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streamin.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    
    public List<Serie> lister(){
        
        SerieDAO daoserie=new SerieDAO();
        return daoserie.listerSerie();
        
    }
    
    public void ajouter(Serie s){
        new SerieDAO().ajouterSerie(s);
    }
    
    public void supprimer(long id){
        new SerieDAO().supprimerSerie(id);
        
    }
    
    public void modifier(Serie s){
        new SerieDAO().modifierSerie(s);
    }
    
    public Serie findbyId(long id){
        
        return new SerieDAO().rechercheSeriebyId(id);
    }
    
}
