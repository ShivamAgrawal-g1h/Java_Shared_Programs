package Java_Language.OOPs;

public class Constructor_Method {
    private static class Point{
        int x,y;
        Point(int a, int b){
            this.x = a; // or simply x = a;
            this.y = b; // or simply y = b;
        }
        void print(){
            System.out.println("x = "+x+" ,y = "+y);
        }
    }
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        p1.print();
        System.out.println(p1);
        int[] arr = new int[8];
        System.out.println(arr);
        int[] brr = new int[9];
        System.out.println(brr);
        String[] str = new String[5];
        System.out.println(str);
        boolean[] b = new boolean[4];
        System.out.println(b);
    }

//    public static class Point{
//        int x,y;
//        void print(){
//            System.out.println("x = "+x+" ,y = "+y);
//        }
//    }
//    public static void main(String[] args) {
//        Point p1 = new Point();
//        p1.print();
//    }
}
