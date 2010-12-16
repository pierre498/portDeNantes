/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

/**
 *
 * @author pierre
 */
public class Navire {

    //var
    protected String numNavire;
    protected String nomNavire;
    protected String libelleFret;
    protected int qteFret;

    //Constructeurs
    public Navire()
    {
    
    }

    public Navire(String numNavire1, String nomNavire1, String libelleFret1, int qteFret1)
    {
        numNavire = numNavire1;
        nomNavire = nomNavire1;
        libelleFret = libelleFret1;
        qteFret = qteFret1;
    }


    //################
    //Method GET/SET
    //###############
    //Fonction d'accès sur la donnée qteFret
    public int getQteFret()
    {
        return (qteFret);
    }

    public void setQteFret(int qte)
    {
        qteFret = qte;
    }

    public String getNomNavire()
    {
        return (nomNavire);
    }

    public void setNomNavire(String nom)
    {
        nomNavire = nom;
    }

    public String getNumNavire()
    {
        return (numNavire);
    }

    public void setNumNavire(String num)
    {
        numNavire = num;
    }

    public String getLibelleFret()
    {
        return (libelleFret);
    }

    public void setLibelleFret(String libelle)
    {
        libelleFret = libelle;
    }

    //######################
    // Methodes Principales
    //#####################

    //Diminue la qte courante de qte
    public void decharger(int qte)
    {
        if(qteFret>=qte)
        {
            qteFret -= qte;
        }
    }

    //indique si la quantite courante est nulle ou non
    public boolean estDecharge()
    {
        boolean bool = false;

        if(qteFret==0)
        {
            bool = true;
        }

        return bool;
    }

    //Affiche les caracteristique d'un navire
    public String afficheNavire()
    {
        StringBuilder sb = new StringBuilder("###############  Navire  ##############\n");
        sb.append("\tNumero de Navire: ").append(numNavire);
        sb.append("\n\tNom de Navire: ").append(nomNavire);
        sb.append("\n\tType de Fret: ").append(libelleFret);
        sb.append("\n\tQte Fret: ").append(qteFret).append("\n");
        return sb.toString();
    }

    public boolean getDangeureux()
    {
        return false;
    }

    public String getType()
    {
        return "Non Dangeureux";
    }

}