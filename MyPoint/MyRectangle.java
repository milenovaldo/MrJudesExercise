public class MyRectangle {
    private MyPoint r1;
    private MyPoint r2;

    public MyRectangle(int l1, int w1, int l2, int w2){
        this.r1 = new MyPoint(l1,w1);
        this.r2 = new MyPoint(l2,w2);
    }

    public MyRectangle(MyPoint r1, MyPoint r2){
        this.r1 = r1;
        this.r2 = r2;

    }

    @Override
    public String toString() {
        return r1 + ", " + r2 ;
    }

    public double getPerimeter(){
        return 2*(r1.distance(r2)+r2.distance(r1));
    }

    public double getArea(){
        return r1.distance(r2) * r2.distance(r1);
    }






}