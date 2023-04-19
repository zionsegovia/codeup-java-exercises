package birds;

public class Goose extends Bird{

    public void makeNoise(String noise){
        System.out.println(this.getName() + " goes " + noise);
    }
}
