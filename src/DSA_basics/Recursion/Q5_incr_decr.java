package DSA_basics.Recursion;
import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inc_dec(1,n);
    }
    static void inc_dec(int start, int end){
        if(start>end) return;
        System.out.println(start);
        inc_dec(start+1,end);
        System.out.println(start);
    }
}
