/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensito;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ausias
 */
public class Pregunta4 {
    
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("examensitoPU");
       EntityManager em = emf.createEntityManager();
        
       
            Query qry2 = em.createNamedQuery("Obra.queryyy", Obra.class);
            List<Obra> list = qry2.getResultList();
            for(Obra o: list){
                System.out.println("Nom obra: " + o.getNom() + " from author: " + o.getAutor().getNom());
            }
       
       
     
    }
    
    
    
}
