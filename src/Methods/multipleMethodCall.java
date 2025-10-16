package Methods;
public class multipleMethodCall {
    public static void main(String[] args) {
        fun();
        fun();
        fun();
    }
    public static void fun() {
        int x=5, y=10;
        System.out.println(x+y);
    }
}
