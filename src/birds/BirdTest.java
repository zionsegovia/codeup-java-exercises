package birds;

public class BirdTest {


    public static void main(String[] args) {
        Quaker quaker  = new Quaker();
        quaker.makeNoise();

        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();

        Goose goose = new Goose();
        goose.setName("Goose");
        goose.makeNoise("HONK HONK");

        Bird goose2 = new Goose();
        goose2.setName("Other goose");
        goose2.makeNoise();
    }
}
