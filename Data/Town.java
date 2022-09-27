package Data;

import java.util.ArrayList;
import java.util.HashMap;

import Data.Ressources.Ressources;
import Data.Units.Units;

public class Town {

    private String name;
    private Player owner;
    private Region parentRegion;
    
    HashMap<Ressources,Integer> ressources = new HashMap<Ressources,Integer>();
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
    public void addRessources(Ressources res, int nbRessources) {
        this.ressources.put(res, this.ressources.get(res)+nbRessources);
    }

    public void removeRessources(Ressources res, int nbRessources) {
        this.ressources.put(res, this.ressources.get(res)-nbRessources);
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