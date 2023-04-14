package aminal;

public class CreatureWorld {
    public static void main(String[] args) {
        Creature dog = new Creature();
        dog.setCreatureType("Dog");
        dog.setCreatureName("Opal");
        dog.setCreatureSound("Bark");
        dog.printCreature();

        Creature cat = new Creature();
        cat.setCreatureType("Cat");
        cat.setCreatureName("Pork");
        cat.setCreatureSound("Meow");
        cat.printCreature();

        Creature cat2 = new Creature();
        cat2.setCreatureType("Cat");
        cat2.setCreatureName("Bean");
        cat2.setCreatureSound("Meow");
        cat2.printCreature();

        Creature cat3 = new Creature();
        cat3.setCreatureType("Cat");
        cat3.setCreatureName("Ruby");
        cat3.setCreatureSound("Meow");
        cat3.printCreature();

        Creature hedgehog = new Creature();
        hedgehog.setCreatureType("Hedgehog");
        hedgehog.setCreatureName("Poyo");
        hedgehog.setCreatureSound("GrrrshhHShhPftt");
        hedgehog.printCreature();

        Creature frog = new Creature();
        frog.setCreatureType("Frog");
        frog.setCreatureName("Tiffany");
        frog.setCreatureSound("Ribbit");
        frog.printCreature();

        Creature frog2 = new Creature();
        frog2.setCreatureType("Frog");
        frog2.setCreatureName("Neptr");
        frog2.setCreatureSound("Croak");
        frog2.printCreature();


    }
}
