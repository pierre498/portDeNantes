/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

/**
 *
 * @author pierre
 */
public class NavireD extends Navire{

    // Var
    private String type;


    // Constructeur
    public NavireD(String typeMatiere)
    {
        super();
        type = typeMatiere;
    }

    // Methodes Get/set
    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String getType()
    {
        return type;
    }


    // Methodes Principales
    @Override
    public String afficheNavire()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.afficheNavire());
        sb.append("\tMatière Dangeureuse: ").append(type).append("\n");
        return sb.toString();
    }

    /*
    @Override
    public void decharger(int qte)
    {
        super.decharger(qte);
        if(qte >= 0)
        {
            super.qteFret -= qte;
        }
    }
     *
     *
     *
     */

    @Override
    public boolean getDangeureux()
    {
        return true;
    }

}
