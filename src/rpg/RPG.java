package rpg;

public class RPG {
    public static void main(String[] args) {
        Fighter coolguy = new Fighter();
        coolguy.setName("Doug");
        coolguy.setHitPoints(12);
        coolguy.setMaxDamage(14);
        coolguy.printStats();

        Fighter weirdguy = new Fighter();
        weirdguy.setName("Bobby");
        weirdguy.setHitPoints(20);
        weirdguy.setMaxDamage(3);
        weirdguy.printStats();

        Fighter smallguy = new Fighter("Shrek", 95, 45);
        smallguy.printStats();

        int d20roll = D20.rolld20();
        System.out.println(d20roll);
    }
}
