/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examensito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ausias
 */
public class Examensito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //PREGUNTA 2 AQUI ANGELA (HE APROVECHADO EL FICHERO DEL MAIN DE LA CREACION DEL PROYECTO
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("examensitoPU");
       EntityManager em = emf.createEntityManager();
       
       Autor aut = new Autor("JuanCarlos", "Espana", "68892134");
       Obra obr1 = new Obra("Cuadrito", aut);
       Obra obr2 = new Obra("Cuadrazo", aut);
     
       try{
        //Obj aut para la bd
        em.getTransaction().begin();
        em.persist(aut);
        em.getTransaction().commit();
        
        //Obj obr1 para la bd
        em.getTransaction().begin();
        em.persist(obr1);
        em.getTransaction().commit();
        
        //Obj obr2 para la bd
        em.getTransaction().begin();
        em.persist(obr2);
        em.getTransaction().commit();
        
       }catch(Exception e){
           System.err.println("ERROR DEL TRY");
       }finally{
           em.close();
       }
       
       
    }
    
}
