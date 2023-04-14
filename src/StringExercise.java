import java.util.Scanner;

//public class StringExercise {
//    public static void main(String[] args) {
//
//    }
//}

class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to say to Bob?");
        String sayToBob = scanner.nextLine();
        if (sayToBob.endsWith("?")){
            System.out.println("Bob: Sure.");
        }
        if (sayToBob.endsWith("!")){
            System.out.println("Bob: Woah, chill out!");
        }
        if (sayToBob.isBlank()){
            System.out.println("Bob: Fine. Be that way!");
  }
        else {
            System.out.println("Bob: Whatever.");
        }

    }
}