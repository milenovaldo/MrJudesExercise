
public class Circle extends Shape{
    private double radius;
    
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}