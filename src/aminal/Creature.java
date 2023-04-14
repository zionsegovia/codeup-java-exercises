package aminal;

public class Creature {

    private String creatureType;

    private String creatureName;

    private String creatureSound;

    public void setCreatureType(String creatureType){
        this.creatureType = creatureType;
    }

    public void setCreatureName(String creatureName){
        this.creatureName = creatureName;
    }

    public void setCreatureSound(String creatureSound){
        this.creatureSound = creatureSound;
    }


    public String getCreatureType(){
        return creatureType;
    }
    public String getCreatureName(){
        return creatureName;
    }
    public String getCreatureSound(){
        return creatureSound;
    }

    public Creature(){}

    public Creature(String creatureType, String creatureName, String creatureSound) {
        this.creatureType = creatureType;
        this.creatureName = creatureName;
        this.creatureSound = creatureSound;

    }


        public void printCreature () {
            System.out.printf("%s is named %s, and sounds like: %s %n", creatureType, creatureName, creatureSound);
        }

    }
