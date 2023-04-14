import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(1,2));
//        System.out.println(Subtraction(1,2));
//        System.out.println(Multiplication(2,2));
//        System.out.println(Division(2,4));
      //  System.out.println(factorials(5));
        System.out.println(dice(2));
    }

    public static int Addition(int n1, int n2) {
        return n1 + n2;
    }

    public static int Subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int Multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int Division(int n1, int n2) {
        return n1 % n2;
    }

//        public static int withinRange(int min, int max){
//            System.out.println("Enter number 1-10");
//        Scanner scanner = new Scanner(System.in);
//        int userInt =
//
//    }
    public static int factorials(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer from 1-10");
        Integer userInt = scanner.nextInt();
        int fact = 0;
        if (userInt > 0 && userInt < 10) {
            int i;
            fact = 1;
            for (i = 1; i <= userInt; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static int dice(int n1) {
        Scanner scanner = new Scanner(System.in);
        boolean rollAgain = true;

        while (rollAgain) {
            System.out.println("Please enter the number of sides for a pair of dice:");
            int diceSides = scanner.nextInt();
            int randNum = (int) (Math.random() * diceSides) + 1;
            System.out.println("The roll is: " + randNum);

            System.out.println("Roll again? (Y/N)");
            String rollAgainStr = scanner.next();

            if (rollAgainStr.equalsIgnoreCase("N")) {
                rollAgain = false;
            }
        }

        return 0;
    }



}