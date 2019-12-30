/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte.banque;

import com.sun.org.apache.xml.internal.serializer.ToStream;
import java.util.StringTokenizer;

/**
 *
 * @author Jaber
 */
public class Compte {
    
    
    
    private int numCompte;
    public void setnumCompt(int numCompt){
	this.numCompte=numCompte;
}
public int getnumCompte(){
	return numCompte;
}


    private String nomProprietaire;
    public void setnomProprietaire(String nomProprietaire){
	this.nomProprietaire=nomProprietaire;
}
public String getnomProprietaire(){
	return nomProprietaire;
}

    
    private float solde;
    public void setsolde(float solde){
	this.solde=solde;
}
public float getsolde(){
	return solde;
    
}  
Compte(int numCompte,String nomProprietaire,float solde)
{
    this.numCompte=numCompte;
    this.nomProprietaire=nomProprietaire;
    this.solde=solde;
}
public boolean retirerArgent(float montant)
{
    if (montant>solde){
        System.out.println("solde insefisent");
        return false;}
    else
    {
        solde=solde-montant;
        return true;
    }
    
}
public void deposerArgent(float montant)
{
    solde =solde+montant;
}

   
    public void consulterSolde() {
        System.out.println(" solde=" + solde );
    }
    public void transfererArge(int montant,Compte A)
    {
        if(this.retirerArgent(montant)==true)
        A.deposerArgent(montant);
        else System.out.println("solde insefisent");
        
    }
    
}
