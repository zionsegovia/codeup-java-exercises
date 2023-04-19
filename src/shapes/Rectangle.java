package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void setLength(double num) {
        this.length = num;
    }

    @Override
    public void setWidth(double num) {
        this.width = num;
    }
}
