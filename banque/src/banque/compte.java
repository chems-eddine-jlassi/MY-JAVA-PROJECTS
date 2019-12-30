package banque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */

public class compte {
    private int numcompte;

    compte (int numcompte,String nomProprietaire,float solde)
{
    this.numcompte=numcompte;
    this.nomProprietaire=nomProprietaire;
    this.solde=solde;
}
    public void setnumcompte(int numcompte){
	this.numcompte=numcompte;
    }

    public int getnumcompte(){
	return numcompte;
    }

    private String nomProprietaire;
    
    public String getNomProprietaire()
    {
        return nomProprietaire;
    }
    
    public void setNomProprietaire(String nom)
    {
        this.nomProprietaire=nom;
    }
    
    
    
    private float solde;
    
     public float getsolde()
    {
        return solde;
    }
    
    public void setsolde(float solde)
    {
        this.solde=solde;
    }

    public boolean retierArgent(int montant)
    {
       if (montant>solde)
       { System.out.println("solde insuffisant");
       return false;}
       else 
       {
           solde=solde-montant;
           return true;
       }
    }
    public void deposerArgent (float montant)
    {
        solde+=montant;
    }
    public void consulterSolde()
    {
        System.out.println("solde est"+solde);
    }
    
    public int transferargent(int montant,compte a)
    {
        if (this.retierArgent(montant)==true)
            a.deposerArgent(montant);
        else
            System.out.println("solde insuffisant");
        return 2;
    }
    
}
