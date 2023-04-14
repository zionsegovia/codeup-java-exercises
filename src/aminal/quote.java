package aminal;

public class quote {

    public static String randomQuote(){
        int randomNumber =(int) (Math.random()* 4) + 1;
        switch (randomNumber){
            case 1: return "I sure love to eat bugs";
            case 2: return "Today looks like a good day for a sandwich";
            case 3: return "I wish I knew how to cook a good omelet";
            case 4: return "Today I went somewhere and then I went home because im an animal";
        }
        return "What in the FUCK";

    }

}


