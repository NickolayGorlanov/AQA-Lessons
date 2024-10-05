package geometry.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        
        circle.displayCharacteristics("Circle");
        rectangle.displayCharacteristics("Rectangle");
        triangle.displayCharacteristics("Triangle");
    }
}
