package Data;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Town> townList = new ArrayList<Town>();

    private int silver;
    private int gold;

    public Player(String name,Region parentRegion){
        this.name = name;
        townList.add(new Town(parentRegion,this, name));
        this.gold = 0;
        this.silver = 0;
    }

    public Player(Region parentRegion, String name, int silver, int gold){
        this.name = name;
        townList.add(new Town(parentRegion, this, name));
        this.gold = gold;
        this.silver = silver;
    }

    /**
     * Player name management
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Player town management
     */
    public ArrayList<Town> getTownList() {
        return townList;
    }

    public void addTown(Town town) {
        this.townList.add(town);
    }

    /**
     * Player money management
     */
    public int getGold() {
        return gold;
    }

    public int getSilver() {
        return silver;
    }

    public void addGold(int gold) {
        this.gold =+ gold;
    }

    public void addSilver(int silver) {
        this.silver =+ silver;
    }
}
