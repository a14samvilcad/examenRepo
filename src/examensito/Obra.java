/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensito;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
/**
 *
 * @author ausias
 */

@Entity
@NamedQueries({
    @NamedQuery(name= "Obra.queryyy",
            query= "SELECT o FROM Obra o")
})
public class Obra implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Integer id;
    @Column(length=50)
    private String nom;
    @ManyToOne
    private Autor autor;
    
    public Obra() {
    }
    
     public Obra(String nom, Autor autor) {
        this.nom = nom;
        this.autor = autor;
    }
     
    public String getNom(){
         return this.nom;
    }
     
    public Autor getAutor(){
         return this.autor;
    }
    
}
