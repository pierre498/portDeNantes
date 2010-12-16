/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.modele;

import com.db4o.*;
import portnantestp1.controleur.Historique;
import portnantestp1.controleur.Matiere;
import portnantestp1.controleur.Navire;
import portnantestp1.controleur.Stats;
import portnantestp1.controleur.ZoneStockage;

/**
 *
 * @author pierre
 */
public class Dbo {
    /*
     * Constructeur
     */
     public Dbo(String name)
     {
         //connectDBO(name);
         db = Db4oEmbedded.openFile(name);
     }

     
    /*
     * Var
     */
    private ObjectContainer db;


    /*
     * Methodes
     */
    public void deconnectDBO()
    {
        db.close();
    }

    public void ajouteObj(Object obj)
    {
        db.store(obj);
    }

    public void removeObj(Object obj)
    {
        db.delete(obj);
    }

    public ObjectSet listeTypeObj(Object obj)
    {
        return listeObjClass(obj.getClass());
    }

    public ObjectSet listeObjClass(Class uneClasse)
    {
        ObjectSet result = null;
        result = db.queryByExample(uneClasse);
        
        return result;
    }

    public boolean existTypeObject(Object obj)
    {
        ObjectSet result = db.queryByExample(obj);
        boolean bool = false;

        if(!result.isEmpty())
            bool = true;

        return bool;
    }

    public int getSizeListObjClass(Class uneClasse)
    {
        ObjectSet result = db.queryByExample(uneClasse);
        return result.size();
    }


    /*
     * Navire
     */
    public Navire getNavire(String numLloyds)
    {
        ObjectSet result = db.query(Navire.class);
        int i=0;
        boolean trouve = false;
        Navire temp = null;

        while(i<result.size() && !trouve)
        {
            if(((Navire)result.get(i)).getNumNavire().equals(numLloyds))
            {
                temp = (Navire) result.get(i);
                trouve = true;
            }
            i++;
        }
        return temp;
    }

    public void removeNavire(String numLloyds)
    {
        Navire temp = getNavire(numLloyds);
        if(temp == null)
            return;
        else
            removeObj(temp);
    }


    /*
     * Matieres
     */
    public void removeMatiere(String nom)
    {
        ObjectSet result = db.query(Matiere.class);
        int i=0;
        boolean trouve = false;

        while(i<result.size() && !trouve)
        {
            if(((Matiere)result.get(i)).getNom().equals(nom))
            {
                removeObj(result.get(i));
                trouve = true;
            }
            i++;
        }
    }

    /*
     * Zone de Stockage
     */
    public ZoneStockage getZoneStockage(int num)
    {
        ObjectSet result = db.query(ZoneStockage.class);
        int i=0;
        boolean trouve = false;
        ZoneStockage temp = null;

        while(i<result.size() && !trouve)
        {
            if(((ZoneStockage)result.get(i)).getNum()==num)
            {
                temp = (ZoneStockage) result.get(i);
                trouve = true;
            }
            i++;
        }
        return temp;
    }

    public void removeZoneStockage(int num)
    {
        ZoneStockage temp = getZoneStockage(num);
        if(temp == null)
            return;
        else
            removeObj(temp);
    }


    /*
     * Stats
     */
    public Stats getStats(String date)
    {
        ObjectSet result = db.query(Stats.class);
        int i=0;
        boolean trouve = false;
        Stats temp = null;

        while(i<result.size() && !trouve)
        {
            if(((Stats)result.get(i)).getDate().equals(date))
            {
                temp = (Stats) result.get(i);
                trouve = true;
            }
            i++;
        }
        return temp;
    }
    
    
    /*
     * Matières
     */
    public Matiere getMatiere(String nom)
    {
        ObjectSet result = db.query(Matiere.class);
        int i=0;
        boolean trouve = false;
        Matiere temp = null;

        while(i<result.size() && !trouve)
        {
            if(((Matiere)result.get(i)).getNom().equals(nom))
            {
                temp = (Matiere) result.get(i);
                trouve = true;
            }
            i++;
        }
        return temp;
    }

        /*
     * Historique
     */
    public Historique getHistorique(String date, String numLloyds, int numNavire)
    {
        ObjectSet result = db.query(Historique.class);
        int i=0;
        boolean trouve = false;
        Historique temp = null;

        while(i<result.size() && !trouve)
        {
            temp = (Historique) result.get(i);
            if((temp.getDate().equals(date) && temp.getnumLloyds().equals(numLloyds) && temp.getnumStock()==numNavire))
            {
                temp = (Historique) result.get(i);
                trouve = true;
            }
            i++;
        }
        return temp;
    }

    public void removeHistorique(String date, String numLloyds, int numStock)
    {
        ObjectSet result = db.query(Historique.class);
        int i=0;
        boolean trouve = false;
        Historique temp = null;

        while(i<result.size() && !trouve)
        {
            temp = (Historique) result.get(i);
            if((temp.getDate().equals(date) && temp.getnumLloyds().equals(numLloyds) && temp.getnumStock()==numStock))
            {
                temp = (Historique) result.get(i);
                db.delete(temp);
                trouve = true;
            }
            i++;
        }
    }
}
