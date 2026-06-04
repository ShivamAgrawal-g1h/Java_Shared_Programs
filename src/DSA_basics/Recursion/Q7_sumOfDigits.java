package DSA_basics.Recursion;
import java.util.Scanner;
class Q7_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
}
