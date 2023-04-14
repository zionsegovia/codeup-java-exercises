import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n" + pi);
        System.out.println("Please give me an integer");
        Integer userInt = scanner.nextInt();
        System.out.println("Your integer is " + userInt);
        System.out.println("Please type three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("Your first word is " + firstWord);
        System.out.println("Your second word is " + secondWord);
        System.out.println("Your third word is " + thirdWord);
        System.out.println("Now, please type a sentence");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence is " + userSentence);
        System.out.println("Please give me the length and width of your room");
        String theLength = scanner.next();
        String theWidth = scanner.next();
        System.out.println("The area of your room is " + Integer.parseInt(theLength) * Integer.parseInt(theWidth));
        System.out.println("The perimeter of your room is " + Integer.parseInt(theLength)* 2 + Integer.parseInt(theWidth)* 2);


    }
}
