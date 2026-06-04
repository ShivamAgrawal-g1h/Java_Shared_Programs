package DSA_basics.Recursion;
import java.util.Scanner;
class Q14_Zig_Zag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zigzag(n);
    }
    static void zigzag(int n){
        if(n==0) return;
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
    }
}
