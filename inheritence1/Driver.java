public class Driver {
    public static void main(String[] args) {
        Circle circle1 = new Circle(69.0, "green", true);
        
        System.out.println(circle1.toString());

        Rectangle rectangle1 = new Rectangle(6.0, 9.0, "yellow", false);

        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Square square1 = new Square();

        System.out.println(square1.toString());

        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter:" + square1.getPerimeter());
    }
}