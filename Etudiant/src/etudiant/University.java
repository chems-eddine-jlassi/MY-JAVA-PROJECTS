/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author pc
 */
public interface University {
     
public void ajouterEtudiant(Etudiant1 e); 

public boolean rechercherEtudiant(Etudiant1 e); 

public boolean rechercherEtudiant(String nom);  

public void supprimerEtudiant(Etudiant1 e);

public void displayEtudiants(); 

public void trierEtudiantsParId(); 

public void trierEtudiantsParNom(); 
} 
    
    
    
    
    
