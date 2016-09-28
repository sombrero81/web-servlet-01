/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamin.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {
    
    public List<Film> listerFilms(){
        
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Film> l = (List<Film>) em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();//ordre descendant by identifiant
        return l;
    }
    
}
