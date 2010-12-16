/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

/**
 *
 * @author pierre
 */
public class Matiere {

    /*
     * Var
     */
    private String nom;


    /*
     * Constructeurs
     */
    public Matiere() 
    {
        
    }

    public Matiere(String nom)
    {
        this.nom = nom;
    }


    /*
     * Get / Set
     */
     public String getNom()
     {
        return nom;
     }

     public void setNom(String nom)
     {
        this.nom = nom;
     }
}
