package rpg;

public class Fighter {



    private String name;
    private int hitPoints;
    private int maxDamage;

    public static int armorClass = 15;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Integer getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(Integer hitPoints){
        this.hitPoints=hitPoints;
    }
    public Integer getMaxDamage(){
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void printStats(){
        System.out.printf("%s has %d hit points and does %d maximum damage." +
                " Armor class is %d.%n", name, hitPoints, maxDamage, armorClass);
    }


    public Fighter(){}

    public Fighter(String name, int hitPoints, int maxDamage){
        this.name =name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;

    }

}
