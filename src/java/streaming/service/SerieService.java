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
    
    public List<Serie> lister1(){
        
        SerieDAO daoserie=new SerieDAO();
        return daoserie.listerSerie();
        
    }
    
    public void ajouterSerie(Serie s){
        new SerieDAO().ajouterSerie(s);
    }
    
}
