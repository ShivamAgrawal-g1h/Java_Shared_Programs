package Java_Language.Complexity;
public class Recursive_function {
    public static void main(String[] args) {
        int s = add(15);
    }
    public static int add(int n) {
        if (n <= 0) return 0;
        return n + add(n - 1);
    }

}
