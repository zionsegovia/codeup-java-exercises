import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//
//        }

//int i = 1;
//        for (int ints = 0; i < 100; i++) {
//            System.out.println(i);
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } if (i % 5 == 0){
//                System.out.println("Buzz");
//            } if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        Integer userInt = scanner.nextInt();
//
//        for (int i = 1; i < userInt; i++){
//            System.out.println(i);
//            System.out.println(i*i);
//            System.out.println(i*i*i);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a numerical grade from 0-100");
        Integer userGrade = scanner.nextInt();
        if (userGrade > 88){
            System.out.println("You have an A!");
        } else if (userGrade > 80){
            System.out.println("You have a B!");
        } else if (userGrade > 67) {
            System.out.println("You have a C");
        } else if (userGrade > 60) {
            System.out.println("You have a D");
        } else if (userGrade > 0) {
            System.out.println("You have an F and need to study");
        }

    }
}

