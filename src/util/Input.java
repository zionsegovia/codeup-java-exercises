package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Enter a valid integer between %d and %d: ", min, max);
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < min || num > max);

        return num;
    }

    public int getInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Enter a number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.printf("Enter a valid decimal number between %.2f and %.2f: ", min, max);
                scanner.next();
            }
            num = scanner.nextDouble();
        } while (num < min || num > max);

        return num;
    }

    public double getDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Enter a valid decimal number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
