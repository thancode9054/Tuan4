public class Point2d {
    private float x;
    private float y;
    
    public Point2d() {
        x = 0;
        y = 0;
    }
    
    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
    
    
    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    public float distance(Point2d p){
        float dx =this.x-p.getX();
        float dy=this.y-p.getY();
        return (float)Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(String[] args) {
        Point2d p1 = new Point2d();
    System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
    p1.move(2, 3);
    System.out.println("Point 1 after moving: (" + p1.getX() + ", " + p1.getY() + ")");
    
    Point2d p2 = new Point2d(4, 5);
    System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    p2.move(-1, -2);
    System.out.println("Point 2 after moving: (" + p2.getX() + ", " + p2.getY() + ")");
    Point2d p3=new Point2d(1,2);
    Point2d p4=new Point2d(4,6);
    System.out.println("distance between p1 and p2: "+p3.distance(p4));
    }
}
