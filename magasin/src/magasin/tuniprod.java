/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin;

/**
 *
 * @author pc
 */
public class tuniprod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Produit p1= new Produit();
       p1.ID=1021;
       p1.libelle="lait";
       p1.marque="delice";
       
       Produit p2= new Produit();
       p2.ID=2510;
       p2.libelle="yagourt";
       p2.marque="vitalait";
       
       Produit p3= new Produit();
       p3.ID=3250;
       p3.libelle="tomato";
       p3.marque="sicam";
       p3.prix=(float) 1.2000;
        old stuff
       */
        Produit p1=new Produit(1021,"lait","delice");
        Produit p2=new Produit(2021,"yagourt","vitalait");
        Produit p3=new Produit(3250,"tommate","sicam", (float) 1.200);
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p1.prix=(float) 0.700;
        p1.afficher();
        p2.prix=(float) 0.400;
        p2.afficher();
        System.out.println(p1);
        System.out.println(p2);
        magasan m6=new magasan(100,"tomato","nacer");
        magasan m7=new magasan(100,"tomao","nacep");
        m6.ajoute(p1);
        m6.ajoute(p2);
        m7.ajoute(p3);
        m6.afficher();
        System.out.println( magasan.getTotal());
        
        //m6.capacite=(int) 014;
    }
    
}
