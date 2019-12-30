/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author pc
 */
public class Banque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     compte a=new compte (6001,"Ben Mohamed Salah ", (float) 850.175);
     compte b = new compte(5002,"Ali Trabelsi ",750);
     
     a.deposerArgent(100);
     a.consulterSolde();
     a.transferargent(100, b);
     a.consulterSolde();
     b.consulterSolde();
     b.retierArgent(1000);
     a.transferargent(10000, b);
     
     
     
     
     
    }
    
}
