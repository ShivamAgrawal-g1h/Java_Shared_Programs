package Library.ArraysClass;

import Java_Language.OOPs.ComplexClass;

import java.util.Arrays;

class binarySearchMethod {
    static void main() {
        int[] arr = {10,20,25,40,40};
        System.out.println(Arrays.binarySearch(arr,20));
        System.out.println(Arrays.binarySearch(arr,0,3,25));
        System.out.println(Arrays.binarySearch(arr,22));


        Point[] prr = { new Point(10,20),
                        new Point(20,15),
                        new Point(25,5),
                        new Point(40,100),
                        new Point(25,5)};
        Point p = new Point(25,5);
        System.out.println(Arrays.binarySearch(prr,p));


    }
}

class Point implements Comparable<Point>{
    int x,y;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point p){
        return this.x-p.x;
    }
    @Override
    public String toString(){
        return "("+x+", "+y+")";
    }
}
