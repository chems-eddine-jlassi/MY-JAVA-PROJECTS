/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte.banque;

/**
 *
 * @author Jaber
 */
public class CompteBanque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compte A = new Compte(6001,"Ben Mohamed Salah",(float) 850.175); 
    
        Compte B = new Compte (5002,"ali trabelsi",(float)750);
        
        
        A.deposerArgent(100);
        A.consulterSolde();
        
        
        A.transfererArge(100, B);
        B.retirerArgent(1000);
        
        A.consulterSolde();
        B.consulterSolde();
        
        
    
    
    
    
    
    
    }
}
