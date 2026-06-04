package DSA.Recursion;
import java.util.Scanner;
class Q2_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreasing(n);
    }
    static void decreasing(int n){
        if(n<1) return;
        System.out.println(n);
        decreasing(n-1);
    }
}
