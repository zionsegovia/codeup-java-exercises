import java.util.Scanner;
public class mini_workout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.next();
        System.out.println("Hello"+ " " + userName);
        System.out.printf("Your string was: %s", userName);
    }
}
