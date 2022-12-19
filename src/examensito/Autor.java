/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examensito;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ausias
 */

@Entity
@Table(name="TAUTORS")
public class Autor implements Serializable{
  @Id
  @GeneratedValue(strategy= GenerationType.TABLE)
  private String nom;
  @Column(length=20)
  private String nacionalitat;
  @Column(length=15)
  private String telefon;
  @OneToMany(mappedBy = "autor", fetch=FetchType.LAZY)
  private List<Obra> obres;
  
  public Autor() {
  }
  
  public Autor(String nom, String nacio, String telf) {
        this.nom = nom;
        this.nacionalitat = nacio;
        this.telefon = telf;
    }
  
  public String getNom(){
      return this.nom;
  }
  
  public String getNacionalitat(){
      return this.nacionalitat;
  }
  
  public String getTelefon(){
      return this.telefon;
  }
    
}
