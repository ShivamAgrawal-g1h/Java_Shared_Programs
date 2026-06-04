package DSA_basics.Recursion;
import java.util.Scanner;
class Q6_OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oddSum(n));
    }
    static int oddSum(int n){
        if(n==1) return 1;
        return 2*n-1 + oddSum(n-1);
    }
}
