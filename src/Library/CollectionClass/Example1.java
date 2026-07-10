package Library.CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Example1 {
    static void main() {
        List<Point> l = new ArrayList<>();
        l.add(new Point(10,20));
        l.add(new Point(5,25));
        l.add(new Point(10,20));
        Point p = new Point(10,20);
        int freq = Collections.frequency(l,p);
        System.out.println(freq);
    }
}
class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    // Uncomment below code for getting freq == 2
//    @Override
//    public boolean equals(Object o){
//        if(o == this) return true;
//        if(!(o instanceof Point)) return false;
//        Point p = (Point)o;
//        return p.x == x && p.y == y;
//    }
}
