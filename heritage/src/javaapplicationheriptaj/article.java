/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationheriptaj;

/**
 *
 * @author Jaber
 */
public class article {
    String nom; 
    double prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficher()
    {
        System.out.println(prix);
    }    
    public article()
    {}
    public article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    
    
    
    
    
    
    
}
