/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

import java.util.ArrayList;

/**
 *
 * @author pierre
 */
public class ZoneStockage {
    /*
     * Var
     */
    private int num;
    protected int capaDispo;
    protected int capaMax;


    /*
     * Constructeurs
     */
    public ZoneStockage()
    {
        
    }

    public ZoneStockage(int num, int capaMax)
    {
        this.capaDispo = capaMax;
        this.capaMax = capaMax;
        this.num = num;
    }

    
    /*
     * Methodes GET / SET
     */

    //retourne la capacite restant dispo
    public int getCapaDispo()
    {
        return(capaDispo);
    }

    public void setCapaDispo(int capaDispo1)
    {
        capaDispo = capaDispo1;
    }

    public int getCapaMax()
    {
        return(capaMax);
    }

    public void setCapaMax(int capaMax1)
    {
        capaMax = capaMax1;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    /*
     * Methodes principales
     */

    //stock la quantite 'qte' et met a jour la capacite dispo
    //(erreur gerer par la method decharger dans port)
    public void stocker(int qte)
    {
        capaDispo -= qte;
    }

    //indique si la zone de stockage est vide ou non
    public boolean estVide()
    {
        if(capaDispo==capaMax) return (true);
        else return (false);
    }

    //inqiue si la zone de stockage est rempli ou non
    public boolean estRempli()
    {
        if(capaDispo==0) return (true);
        else return (false);

    }

    public boolean trouveType(String type)
    {
        return false;
    }

    public void vider()
    {
        capaDispo = capaMax;
    }

    public boolean estDangeureux()
    {
        return false;
    }
}
