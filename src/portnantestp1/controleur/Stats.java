/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.controleur;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import portnantestp1.util.DateUtils;

/**
 *
 * @author pierre
 */
public class Stats {

    /*
     * Var
     */
    private String date;
    private HashMap<String, Integer> stat;
    
    
    /*
     * Methodes
     */
    public Stats()
    {
        date = DateUtils.now().toString();
        stat = new HashMap<String, Integer>();

        stat.put("Navire", Ports.getListNavire().size());
        stat.put("ZoneStockage", Ports.getListZonesStockage().size());
    }


    /*
     * Get / Set
     */
    public String getDate()
    {
        return date;
    }

    public Integer getStatTotal(String nom)
    {
        return stat.get(nom);
    }

    public Integer getStatNavireDangereux()
    {
        List lst = Ports.getListNavire();
        int cpt = 0;

        for(int i=0 ; i<lst.size() ; i++)
        {
            if(lst.get(i) instanceof NavireD)
                cpt++;
        }

        return cpt;
    }

    public Integer getStatNavire()
    {
        return Ports.getSizeListNavires() - getStatNavireDangereux();
    }


    public Integer getStatZoneDangereux()
    {
        List lst = Ports.getListZonesStockage();
        int cpt = 0;

        for(int i=0 ; i<lst.size() ; i++)
        {
            if(lst.get(i) instanceof ZoneStockageD)
                cpt++;
        }

        return cpt;
    }

    public Integer getStatZone()
    {
        return Ports.getSizeListStockage() - getStatZoneDangereux();
    }
}
