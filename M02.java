public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(Point another){
        int newX = another.getX();
        int newY = another.getY();
        int before03 = (this.x - newX) * (this.x - newX) + (this.y - newY)
				* (this.y - newY);
        double result03 = Math.sqrt(before03);
        return result03;
    }
}

public class M02 {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);  
        System.out.println("distance(second) = " + first.distance(second));  
    }
}

TRIAL --> CHANGES BY DEV - 01

