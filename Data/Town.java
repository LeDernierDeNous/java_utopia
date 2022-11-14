package Data;

import java.util.ArrayList;
import java.util.HashMap;

import Data.Ressources.AdvancedRessources;
import Data.Ressources.Ressources;
import Data.Units.Units;

public class Town {

    private String name;
    private Player owner;
    private Region parentRegion;
    
    HashMap<Ressources,Integer> ressources = new HashMap<Ressources,Integer>();
    HashMap<AdvancedRessources,Integer> avancedRessources = new HashMap<AdvancedRessources,Integer>();
    ArrayList<Units> units = new ArrayList<Units>();

    public Town(Region parentRegion,Player owner,String name){
        for (Ressources res : Ressources.values()) {
            ressources.put(res, 0);
        }
        setOwner(owner);
        setName(name);
        this.parentRegion = parentRegion;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return owner;
    }

    public Region getParentRegion() {
        return parentRegion;
    }

    /**
     *  Town ressources management
     */

    public HashMap<Ressources, Integer> getRessources() {
        return ressources;
    }

    public int getRessources(Ressources res) {
        return getRessources().get(res);
    }
    
    public void addRessources(Ressources res, int nbRessources) {
        this.ressources.put(res, this.ressources.get(res)+nbRessources);
    }

    public void removeRessources(Ressources res, int nbRessources) {
        this.ressources.put(res, this.ressources.get(res)-nbRessources);
    }

    public int getMaxConvertToAdvancedRessources(AdvancedRessources advRes){
        switch (advRes) {
            case AD1:
                return (int) Math.floor( Math.min(getRessources(Ressources.M1)/50,getRessources(Ressources.M4)/50) );
            case AD2:
                return (int) Math.floor( Math.min(getRessources(Ressources.M2)/50,getRessources(Ressources.M5)/50) );
            case AD3:
                return (int) Math.floor( Math.min(getRessources(Ressources.M3)/50,getRessources(Ressources.M6)/50) );
        
            default:
                System.out.println("Error - This type doesn't exist");
                return -1;
        }
    }

    public void convertToAdvancedRessources(AdvancedRessources advRes, int nbRessources){
        switch (advRes) {
            case AD1:
                if (nbRessources < getMaxConvertToAdvancedRessources(advRes)) {
                    removeRessources(Ressources.M1, nbRessources*50);
                    removeRessources(Ressources.M4, nbRessources*50);
                    break;
                }

            case AD2:
                if (nbRessources < getMaxConvertToAdvancedRessources(advRes)) {
                    removeRessources(Ressources.M2, nbRessources*50);
                    removeRessources(Ressources.M5, nbRessources*50);
                    break;
                }

            case AD3:
                if (nbRessources < getMaxConvertToAdvancedRessources(advRes)) {
                    removeRessources(Ressources.M3, nbRessources*50);
                    removeRessources(Ressources.M6, nbRessources*50);
                    break;
                }
                System.out.println("Error - The town don't have the ressources needed");
                break;

            default:
                System.out.println("Error - This type of ressources doesn't exist");
                break;
        }
    }

    /**
     *  Town units management
     */
    public void addUnits(Units unit) {
        this.units.add(unit);
    }

    public void addUnits(ArrayList<Units> units){
        this.units.addAll(units);
    }

    public void removeUnits(Units unit) {
        this.units.remove(unit);
    }

    public void removeUnits(ArrayList<Units> units){
        this.units.removeAll(units);
    }

    public ArrayList<Units> removeAllUnits(){
        ArrayList<Units> temp = new ArrayList<Units>(this.units);
        this.units.clear();
        return temp;
    }
}