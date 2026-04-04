package DSA.Recursion;
import java.util.Scanner;
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dec_inc(n);
    }
    static void dec_inc(int n){
        if(n<1) return;
        System.out.println(n); // dec
        dec_inc(n-1);
        System.out.println(n); // inc
    }
}
