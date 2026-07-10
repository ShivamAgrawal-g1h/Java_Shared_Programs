package Library.ArraysClass;

import java.util.Arrays;

class ToStringMethod {
    static void main() {
        int[] arr = {10,20,30};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Point[] prr = {new Point(10,20),
                        new Point(5,30)};
        System.out.println(Arrays.toString(prr));
    }
}
//class Point implements Comparable<Point>{
//    int x,y;
//    Point(int x , int y){
//        this.x = x;
//        this.y = y;
//    }
//    @Override
//    public int compareTo(Point p){
//        return this.x-p.x;
//    }
//    @Override
//    public String toString(){
//        return "("+x+", "+y+")";
//    }
//}