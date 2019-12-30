/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin;

/**
 *
 * @author pc
 */
public class magasan {
    private static int total;
    
    private int identifiant;
    private String magasinC;
    private String adresse ;
    private int capacite;
    private Produit[] myprod ;
    private employee[]mynigo;
    private int nbemployee;

    public magasan() {
        myprod=new Produit[50];
        mynigo=new employee[100];
        
    }

    public magasan(int identifiant, String magasinC, String adresse) {
        this.identifiant = identifiant;
        this.magasinC = magasinC;
        this.adresse = adresse;
        this.capacite = 0;
        myprod=new Produit[50];
        mynigo=new employee[100];
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMagasinC() {
        return magasinC;
    }

    public void setMagasinC(String magasinC) {
        this.magasinC = magasinC;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public static int getTotal() {
        return total;
    }
    
// methode ajoute employee
    public void ajouteEmployee (employee c)
    {
        mynigo[nbemployee]=c;
        nbemployee++;
    }
/*methode ajoute produit*/
    public void ajoute(Produit p)
    {
  if (capacite<=49)
  { myprod[capacite]=p;
  capacite++;
  total++;
  }
  else
  {
      System.out.println("magasin est plein");
  }
}
    /*methode afficher*/
    public void afficher()
    {
        System.out.println(identifiant+""+adresse+""+magasinC+"");
    for (int i=0;i<capacite;i++)
    {
        System.out.println(myprod[i].libelle);
        System.out.println(myprod[i].prix);
    
}
    }
}
