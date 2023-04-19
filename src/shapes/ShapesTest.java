package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        //Rectangle box1 = new Rectangle(4, 5);
        //System.out.println(box1.getArea());
        //System.out.println(box1.getPerimeter());
        //Rectangle box2 = new Square(5);
        //System.out.println(box2.getPerimeter());
        //System.out.println(box2.getArea());
        Quadrilateral myShape;
        myShape = new Rectangle(10, 15);
        System.out.println("Rectangle Area => " + myShape.getArea());
        System.out.println("Rectangle Perimeter => " + myShape.getPerimeter());

        myShape = new Square(10);
        System.out.println("Square Area => " + myShape.getArea());
        System.out.println("Square Perimeter => " + myShape.getPerimeter());

    }
}
