package DSA_basics.Recursion;
import java.util.Scanner;
class Q11_Stair_Case3Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Ways to reach %dth stair : %d",n,stairCase2(n));
    }
    static int stairCase2(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        return stairCase2(n-1) + stairCase2(n-2) + stairCase2(n-3);
    }
}
