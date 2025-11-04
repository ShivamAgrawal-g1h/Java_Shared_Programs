package Java_Language.OOPs;

public class this_example3 {
    static class Point{
        int x,y;
        Point(int x, int y){
            this.x = x;this.y = y;
        }
        Point() {
            this(10,10);
        }
        void print() {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.print();
    }
}
