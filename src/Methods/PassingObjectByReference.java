package Methods;
public class PassingObjectByReference {
    public static void main(String[] args) {
       Point p = new Point();
        p.x =5;
        p.y =10;
        fun(p);
        System.out.println(p.x+" "+p.y);
    }

    public static void fun(Point P) {
        P.x = 10;
        P.y = 14;
    }
}
