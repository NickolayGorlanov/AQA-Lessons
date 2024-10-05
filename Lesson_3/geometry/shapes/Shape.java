package geometry.shapes;

interface Shape {

    double calculateArea();

    default double calculatePerimeter() {
        return 0.0;
    }

    String getFillColor();

    String getBorderColor();

    default void displayCharacteristics(String shapeName) {
        System.out.println(shapeName + ":");
        System.out.println("Fill Color: " + getFillColor());
        System.out.println("Border Color: " + getBorderColor());
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
