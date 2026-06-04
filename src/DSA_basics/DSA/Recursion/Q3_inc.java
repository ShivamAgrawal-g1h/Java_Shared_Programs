package DSA.Recursion;
import java.util.Scanner;
class Q3_inc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increasing(n);
    }
    static void increasing(int n){
        if(n<1) return;
        increasing(n-1);
        System.out.println(n);
    }
}
