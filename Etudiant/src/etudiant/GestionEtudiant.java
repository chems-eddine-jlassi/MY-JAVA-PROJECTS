/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pc
 */
public class GestionEtudiant implements University {
    ArrayList<Etudiant1> students=new ArrayList();

    @Override
    public void ajouterEtudiant(Etudiant1 e) {
        students.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant1 e) {
        return students.contains(e); 
       
    }

    

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i=0;i<students.size();i++)
        {
        if(students.get(i).getNom().equals(nom))
         return true;
        }
        return false;
     
    }

    @Override
    public void supprimerEtudiant(Etudiant1 e) {
        students.remove(e);
        
    }

    @Override
    public void displayEtudiants() {
       for(int i=0;i<students.size();i++)
       {
           System.out.println(students.get(i).toString());
       }
     
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(students);
       
    }

    @Override
    public void trierEtudiantsParNom() {
          Collections.sort(students,new critereNom());
        
    }


  

    
    
    
    
    
    
    
    
    
}
