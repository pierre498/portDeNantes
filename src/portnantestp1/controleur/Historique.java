/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

import portnantestp1.util.DateUtils;

/**
 *
 * @author pierre
 */
public class Historique {

    /*
     * Var
     */
    private String date;
    private String numLloyds;
    private String matiere;
    private int numStock;
    private int qte;


    /*
     * Constructor
     */
    public Historique(String numLloyd, int numStock, String matiere, int qte)
    {
        this.date = DateUtils.now();
        this.numLloyds = numLloyd;
        this.numStock = numStock;
        this.matiere = matiere;
        this.qte = qte;
    }


    /*
     * Methodes
     */
    public String getDate()
    {
        return date;
    }

    public String getnumLloyds()
    {
        return numLloyds;
    }

    public String getMatiere()
    {
        return matiere;
    }

    public int getnumStock()
    {
        return numStock;
    }

    public int getQte()
    {
        return qte;
    }
}
