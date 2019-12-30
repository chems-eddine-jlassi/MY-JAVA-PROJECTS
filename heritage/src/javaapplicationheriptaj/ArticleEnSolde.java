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
public class ArticleEnSolde extends article{
    
    public int Remise;

   

    public int getRemise() {
        return Remise;
    }

   public void SetRemise(int Remise){
       this.Remise=Remise;
   }

    public ArticleEnSolde(int Remise, String nom, double prix) {
        super(nom, prix);
        this.Remise = Remise;
    }
   
    @Override
    public double getPrix() {
        return prix-prix*Remise/100;
    }
    
    @Override
   public void afficher()
    {
        System.out.println(this.getPrix()+"     "+Remise);
    }    
   
   
    
    
    
    
    
   
   
   }
    
    
    
    
    
    
    
    
    
