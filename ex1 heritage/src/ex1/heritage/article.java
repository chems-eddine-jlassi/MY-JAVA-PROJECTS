package ex1.heritage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class article {
  protected  double prix;
  protected  String Nom;
article()
{
    
}
  
    public article(double prix, String Nom) {
        
        this.prix = prix;
        this.Nom = Nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    public void afficher()
    {
        System.out.println("prix"+prix);
    }
    
}
