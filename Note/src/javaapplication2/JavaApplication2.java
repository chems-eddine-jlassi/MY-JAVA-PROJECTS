/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Jaber
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notes n1 = new Notes(10, 12, 15, 11, 17, (float) 9.5);
        Notes n2 = new Notes((float)11.5, 13, 18, 10,(float) 12.5);
        
        System.out.println("Moyenne n1 = "+n1.CalculMoyenne());
        System.out.println("Moyenne n2 = "+n2.CalculMoyenne());
        if (n1.CalculMoyenne()>n2.CalculMoyenne())
            System.out.println("n1 > n2");
        else System.out.println("n1 < n2");
       
        
        
        
        
        
        
    }
    
}
