package shapes;

import util.Input;

public class Circle {

    public static int totalCircles;

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void outputCircleInfo(){
        double radius = new Input().getDouble();
        Circle circle = new Circle(radius);
        System.out.printf("The area of your circle is: %.2f%n", circle.getArea());
        System.out.printf("The circumference of your circle is: %.2f%n", circle.getCircumference());
    }

    public Circle(double radius) {
        this.radius = radius;
        totalCircles++;
    }
}
