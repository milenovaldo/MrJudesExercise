/**
 * MyCircle
 */
public class MyCircle {
    private
        MyPoint center;
        int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the center
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] return_list = {this.getCenterX(), this.getCenterY()};
        return return_list;
    }

    public void setCenterXY(int x, int y) {
        setCenterX(x);
        setCenterY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + this.radius + ",center=" + this.center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center); 
    }


}