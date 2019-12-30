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
public class articleremise extends article {
    private float remise ;
   

    public articleremise() 
    {
    }
    public articleremise(float remise, double prix, String Nom)
    {
        super(prix, Nom);
        this.remise = remise;
    }

    @Override
    public double getPrix() 
    {
    return this.prix-((this.prix*this.remise)/100);  
       
    }
    @Override
     public void afficher()
    {
        System.out.println("prix"+getPrix());
    }
            
}
    
    
    

