/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package portnantestp1.controleur;

import java.util.List;
import portnantestp1.modele.Dbo;

/**
 *
 * @author pierre
 */
public class Ports {
    /*
     * Var
     */
    private static Dbo db;


    /*
     * Gestion de la Connection / Deconnection à la base && sauvegarde / restauration des objets
     */

    // Enregistre les navires et zones de stockage dans la BDDO (les ecrase si existe) && deconnection
    public static void connection()
    {
        // Open || Create Database
        db = new Dbo("portNantes.db");
    }


    public static void decoDBO()
    {
        db.deconnectDBO();
    }


    /*
     * Methodes Principales
     */
  public static void dechargement(Navire unNavire)
    {
        List<ZoneStockage> lst = db.listeObjClass(ZoneStockage.class);
        int i=0, dech=0;

        while(i<lst.size() && unNavire.estDecharge()==false)
        {
            ZoneStockage temp = lst.get(i);
            dech=0;

            if(!temp.estRempli());
            {
                if(!(unNavire instanceof NavireD) || (temp instanceof ZoneStockageD && temp.trouveType(unNavire.getType())))
                {
                    if(unNavire.getQteFret() <= temp.getCapaDispo())
                    {
                        dech=unNavire.getQteFret();
                        db.getZoneStockage(temp.getNum()).stocker(unNavire.getQteFret());
                        db.getNavire(unNavire.getNumNavire()).decharger(unNavire.getQteFret());
                    }
                    else
                    {
                        //Stock le fret maximum possible
                        int capa = temp.getCapaDispo();
                        dech=capa;
                        db.getZoneStockage(temp.getNum()).stocker(capa);

                        //decharge le navire du "prestockage" précedent
                        db.getNavire(unNavire.getNumNavire()).decharger(capa);
                    }
                    if(dech!=0)
                    {
                        Historique hist = new Historique(unNavire.getNumNavire(), temp.getNum(), unNavire.getType(),dech);
                        db.ajouteObj(hist);
                    }
                    db.ajouteObj(temp);
                    db.ajouteObj(unNavire);
                }
            }
            i++;
        }

    }

    public static void dechargement(String noLloyd)
    {
        dechargement(getNavire(noLloyd));
    }

    
    /*
     * Gestion des objets en general
     */
    public static void ajoutObj(Object obj)
    {
        db.ajouteObj(obj);
    }

    /*
     * Gestion Des Zones de Stockage
     */
    public static void ajoutZoneStockage(ZoneStockage unHangard)
    {
        db.ajouteObj(unHangard);
    }

    public static void supprimeZoneStockage(int num)
    {
        db.removeZoneStockage(num);
    }
    
    public static ZoneStockage getZoneStockage(int num)
    {
        return db.getZoneStockage(num);
    }

    public static List getListZonesStockage()
    {
        return db.listeObjClass(ZoneStockage.class);
    }

    public static int getSizeListStockage()
    {
        return db.listeObjClass(ZoneStockage.class).size();
    }
    

    /*
     * Gestion Des Navires
     */
    public static void ajoutNavire(Navire unNavire)
    {
        db.ajouteObj(unNavire);
    }

    public static void supprimeNavire(Navire unNavire)
    {
        db.removeObj(unNavire);
    }

    public static void supprimeNavire(String numNavire)
    {
        db.removeNavire(numNavire);
    }

    public static int getSizeListNavires()
    {
        return db.getSizeListObjClass(Navire.class);
    }

    public static Navire getNavire(String num)
    {
       return db.getNavire(num);
    }

    public static List getListNavire()
    {
        return db.listeObjClass(Navire.class);
    }


    /*
     * Gestion des Matiere
     */
    public static void ajoutMatiere(String nom)
    {
        Matiere mat = new Matiere(nom);
        db.ajouteObj(mat);
    }
    
    public static List getListMatieres()
    {
        return db.listeObjClass(Matiere.class);
    }

    public static void supprimeMatiere(String nom)
    {
        db.removeMatiere(nom);
    }

    public static Matiere getMatiere(String nom)
    {
        return db.getMatiere(nom);
    }


    /*
     * Stats
     */
    public static List getListStats()
    {
        return db.listeObjClass(Stats.class);
    }

    public static Stats getStat(String date)
    {
        return db.getStats(date);
    }


    /*
     * Historique
     */
    public static List getListHistorique()
    {
        return db.listeObjClass(Historique.class);
    }

    public static void removeHistorique(String date, String numLloyds, int numStock)
    {
        db.removeHistorique(date, numLloyds, numStock);
    }
}
