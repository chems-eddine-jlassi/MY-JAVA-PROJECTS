/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author pc
 */
public class Etudiant1 implements Comparable<Etudiant1>{
   private int Id;
   private String nom;
   private String premom;
 public Etudiant1() {
    }
    public Etudiant1(int Id, String nom, String premom) {
        this.Id = Id;
        this.nom = nom;
        this.premom = premom;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPremom() {
        return premom;
    }

    public void setPremom(String premom) {
        this.premom = premom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant1 other = (Etudiant1) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    
    }

    @Override
    public int compareTo(Etudiant1 t) {
       return this.Id-t.Id; 
    }

   
    
   
   
   
   
   
   
   
   
   
   
}
