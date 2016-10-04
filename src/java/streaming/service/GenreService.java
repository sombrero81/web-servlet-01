/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streamin.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {
    
    public List<Genre> lister(){
        
        GenreDAO dao=new GenreDAO();
        return dao.listerGenres();
    }
    
    public Genre findbyId(long id){
        
        return new GenreDAO().recherche(id);
    }
    
    public void ajouter (Genre g){
        
        new GenreDAO().ajouterGenre(g);
    }
    
    
    public void modifier(Genre g){
        
        new GenreDAO().modifierGenre(g);
    }
    
    public void supprimer(long id){
        new GenreDAO().supprimerGenre(id);
    }
    
    
    
    
}
