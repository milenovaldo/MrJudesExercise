public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){};

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        int[] point = new int[2];
        point[1] = this.x;
        point[2] = this.y;
        return point;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    // pythagoras
    public double distance(int x, int y){
        int xCoord = this.x - x;
        int yCoord = this.y - y;
        return Math.sqrt(xCoord*xCoord + yCoord*yCoord);
    }

    public double distance(MyPoint another){
        int xCoord = this.x - another.x;
        int yCoord = this.y - another.y;
        return Math.sqrt(xCoord*xCoord + yCoord*yCoord);
    }

    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }


}