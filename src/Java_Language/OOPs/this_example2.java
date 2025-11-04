package Java_Language.OOPs;
public class this_example2 {
    static class Point{
        int x,y;
        Point(int x, int y){
            this.x = x;this.y = y;
        }
        Point setX(int x) {
            this.x = x;
            return this;
        }
        Point setY(int y) {
            this.y = y;
            return this;
        }
        void print() {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(5,15);
        p1.print();
        p1.setX(20).setY(50).setX(35).print();
    }
}
