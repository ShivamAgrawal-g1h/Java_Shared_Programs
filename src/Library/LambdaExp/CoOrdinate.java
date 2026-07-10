package Library.LambdaExp;

import java.util.ArrayList;
import java.util.Arrays;

class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class CoOrdinate {
    static void main() {
        Point[] arr = { new Point(10,20),
                        new Point(5,30),
                        new Point(30,40),
                        new Point(5,35),
                        new Point(5,15)};
        Arrays.sort(arr,(p1,p2) -> p1.x - p2.x );
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i].x+" "+ arr[i].y);
    }
}
