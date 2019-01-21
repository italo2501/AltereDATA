/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alteredata.dao;

import br.com.alteredata.conection.ConnectionFactory;
import br.com.alteredata.model.Religador;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author italo
 */
public class ReligadorDAO {
    
     public Religador save(Religador religador) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (religador.getnReligador() == null) {
                em.persist(religador);
            } else {
                em.merge(religador);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return religador;
    }
    
     public Religador findByNumeroSerie(String nSerie) {

        EntityManager em = new ConnectionFactory().getConnection();
        Religador religador = null;

        try {
            religador = em.find(Religador.class, nSerie);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return religador;
    }
    
      public List<Religador> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Religador> religadores = null;

        try {
            religadores = em.createQuery("from Religador r").getResultList();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return religadores;
    }
     
     
     
}
