package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(double num) {
        this.length = num;
        this.width = num;
    }
}
