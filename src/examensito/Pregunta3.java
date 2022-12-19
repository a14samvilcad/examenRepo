/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ausias
 */
public class Pregunta3 {
     public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("examensitoPU");
       EntityManager em = emf.createEntityManager();
       
       try{
            Autor aut = em.find(Autor.class, "JuanCarlos");
            System.out.println("El id del zona es: " + aut.getNom() + " i la seva descripcio: " + aut.getNacionalitat());
       }catch(Exception e){
           System.err.println("Error en el try");
       }finally{
           em.close();
       }
       
       
     }
}
