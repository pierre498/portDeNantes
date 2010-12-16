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
public class ZoneStockageD extends ZoneStockage{

    /*
     * Constructeur
     */
    public ZoneStockageD()
    {
        // Appel du constructeur de la classe mere
        super();
        typeDangers = new ArrayList<String>();
    }


    /*
     * Var
     */
    private ArrayList<String> typeDangers;
    

    /*
     * Methodes Get/Set
     */
    public ArrayList<String> getMatiereD()
    {
        return typeDangers;
    }

    public void setMatiereD(ArrayList<String> arrayTypeDangers)
    {
        typeDangers = arrayTypeDangers;
    }


    /*
     * Methodes principales
     */
    public void addTypeDangers(String type)
    {
        typeDangers.add(type);
    }

    @Override
    public boolean trouveType(String type)
    {
        boolean temp = false;
        int i = -1;

        try
        {
            do
            {
                i++;
                if(typeDangers.get(i).equals(type))
                    temp=true;

            }while(!temp && i<typeDangers.size());
        }
        catch(Exception e)
        {
        }

        return temp;
    }

    @Override
    public boolean estDangeureux()
    {
        return true;
    }
}
