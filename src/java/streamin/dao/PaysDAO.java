/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamin.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class PaysDAO {
    
    public List<Pays> listerPays(){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        List<Pays> l = (List<Pays>) em.createQuery("SELECT p FROM Pays p ORDER BY p.nom DESC").getResultList();
        return l;
    }
    
    public void ajouterPays(Pays p){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public void supprimerPays(long id){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Pays p WHERE p.id=" + id).executeUpdate();
        //em.remove(em.find(pays.class,id)); autre facon que le DELETE
        em.getTransaction().commit();
    }
    
    public void modifierPays(Pays p){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public Pays recherchePaysbyId(long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Pays.class, id);
    }
    
}
