/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.Comparator;

/**
 *
 * @author pc
 */
public class critereNom implements Comparator<Etudiant1>{

    @Override
    public int compare(Etudiant1 t, Etudiant1 t1) {
            return t.getNom().compareTo(t1.getNom());
    }
    
}
