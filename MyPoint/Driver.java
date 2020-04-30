/**
 * Driver
 */
public class Driver {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(4,2,4);
        MyCircle c2 = new MyCircle(1,0,4);
        MyPoint example1 = new MyPoint(8,7);

        System.out.println(c2.distance(c1));

        c1.setCenterX(5);

        System.out.println(c1.getCenter());

        c2.setCenter(example1);

        System.out.println(c2.toString());

    }
}