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
public class Produit {
    int ID;
    String libelle;
    String marque;
    float prix;  

Produit()
{

} 
Produit(int ID,String libelle,String marque,float prix)
{
    this.ID=ID;
    this.libelle=libelle;
    this.marque=marque;
    this.prix=prix;
}
Produit(int ID,String libelle,String marque)
{
    this.ID=ID;
    this.libelle=libelle;
    this.marque=marque;
    }
void afficher()
{
    System.out.println("  ID=" +ID  +"  libelle="+libelle +"   marque"+marque +"   prix"+prix );
}

    @Override
    public String toString() {
        return "Produit{" + "ID=" + ID + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + '}';
    }

}
