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
    
    public void ajouterFilm(Film f){
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        
    }
    
    public void modifierFilm(Film f){
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }
    
    public void supprimerFilm(long id){
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film f WHERE f.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }
    
    
    public Film rechercheParId(long id){
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Film.class, id);
        
    }
}
