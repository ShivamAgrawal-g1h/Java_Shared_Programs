package Java_Language.Advanced;
import java.util.Arrays;
class co_ordinate{
    int x,y;
    co_ordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Q4_ArraysSortUsingLambda {
    public static void main(String[] args) {
        co_ordinate[] arr = {new co_ordinate(10,20),
                new co_ordinate(5,30),
                new co_ordinate(30,40)};
        //sorting acc. to x co-ordinates in ascending order
        Arrays.sort(arr,(o1,o2)->o1.x -o2.x);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].x+" "+arr[i].y);
        }
    }
}
