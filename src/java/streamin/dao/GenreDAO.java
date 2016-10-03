/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamin.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDAO {
    
    public List<Genre> listerGenres(){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Genre> g= (List<Genre>) em.createQuery("SELECT g FROM Genre g ORDER BY g.nom DESC").getResultList();
        return g;
        
    }
    
    public Genre recherche(long id){
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Genre.class, id);
        
    }
    
}
