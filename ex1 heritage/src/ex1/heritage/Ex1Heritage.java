/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.heritage;

/**
 *
 * @author pc
 */
public class Ex1Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    article a =new article(500,"hh");
    article c =new article(500,"hb");
    a.afficher();
    c.afficher();
    articleremise b =new articleremise(50,5,"hh");
    articleremise d =new articleremise(50,4,"hh");    
    b.afficher();
    d.afficher();
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }
    
}
