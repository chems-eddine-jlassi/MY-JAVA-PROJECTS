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
public class JavaApplicationheriptaj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    article a = new article ("A",100);
    a.afficher();
    ArticleEnSolde b = new ArticleEnSolde (20,"b",100);
    b.afficher();
    }
    
}
