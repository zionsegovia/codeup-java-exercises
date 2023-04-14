package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        // Test getString()
        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        // Test yesNo()
        System.out.print("Enter y/n: ");
        boolean yesNo = input.yesNo();
        System.out.println("You entered: " + yesNo);

        // Test getInt(int min, int max)
        int min = 1, max = 10;
        int num = input.getInt(min, max);
        System.out.printf("You entered: %d, which is between %d and %d\n", num, min, max);

        // Test getInt()
        System.out.print("Enter an integer: ");
        num = input.getInt();
        System.out.println("You entered: " + num);

        // Test getDouble(double min, double max)
        double dMin = 1.0, dMax = 5.0;
        double dNum = input.getDouble(dMin, dMax);
        System.out.printf("You entered: %.2f, which is between %.2f and %.2f\n", dNum, dMin, dMax);

        // Test getDouble()
        System.out.print("Enter a decimal number: ");
        dNum = input.getDouble();
        System.out.println("You entered: " + dNum);
    }
}
