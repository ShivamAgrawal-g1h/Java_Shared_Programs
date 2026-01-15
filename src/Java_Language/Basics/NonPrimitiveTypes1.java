package Java_Language.Basics;
class Point{
    int x;
    int y;
}
class NonPrimitiveTypes1 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        System.out.println("Point coordinates : "+p.x+","+p.y);
    }
}
