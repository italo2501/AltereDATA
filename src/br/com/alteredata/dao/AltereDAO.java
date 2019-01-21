/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alteredata.dao;

import br.com.alteredata.conection.ConnectionFactory;
import br.com.alteredata.model.Altere;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author italo
 */
public class AltereDAO {
     
    public Altere save(Altere altere) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (altere.getMac() == null) {
                em.persist(altere);
            } else {
                em.merge(altere);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return altere;
    }
    
     public Altere findByMac(String mac) {

        EntityManager em = new ConnectionFactory().getConnection();
        Altere altere = null;

        try {
            altere = em.find(Altere.class, mac);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return altere;
    }
    
     
      public List<Altere> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Altere> Alteres = null;

        try {
            Alteres = em.createQuery("from Altere a").getResultList();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return Alteres;
    }
     
     
    
}
