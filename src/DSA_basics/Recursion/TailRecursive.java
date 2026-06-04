package DSA_basics.Recursion;
import java.util.Scanner;
class TailRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of n = "+factTR(n,1));
    }
    static int factTR(int n, int a){
        if (n == 0) return a;
        return factTR(n-1, n*a);
    }
}
