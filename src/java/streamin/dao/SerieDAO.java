/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamin.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {
    
    public List<Serie> listerSerie(){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Serie> s =(List<Serie>) em.createQuery("SELECT s FROM Serie s ORDER BY s.id DESC").getResultList();
        return s;
    }
    
    public void ajouterSerie(Serie s){
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        
    }
    
    public void supprimerSerie(long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Serie s WHERE s.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }
    
    public void modifierSerie(Serie s){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
        
    }
    
    public Serie rechercheSeriebyId(long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Serie.class, id);
    }
    
    
    
}

