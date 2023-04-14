import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Integer usersGuess;
        int randNum;
        do {
            Scanner scanner = new Scanner(System.in);
            randNum = (int) (Math.random() * 100);
            System.out.println("Go ahead guess a number...");
            usersGuess = scanner.nextInt();
            if (usersGuess == randNum) {
                System.out.println("Good guess! You win");
            } else {
                if (usersGuess > randNum) {
                    System.out.println("Try something lower");
                } else {
                    if (usersGuess < randNum) {
                        System.out.println("Try something higher");
                    }
                }
            }
        } while (usersGuess != randNum);
    }
}
