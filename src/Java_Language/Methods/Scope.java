package Java_Language.Methods;
public class Scope {
    public static void main(String[] args) {
        int x=5;
        fun(x);
        System.out.println(x);
    }
    public static void fun(int x) {
        x = x + 5;
    }
}
