package DSA.Recursion;
import java.util.Scanner;
/// Two jumps max. at a time
class Q10_Stair_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Ways to reach %dth stair : %d",n,stairCase(n));
    }
    static int stairCase(int n){
        if(n==0 || n==1) return 1;
        return stairCase(n-1) + stairCase(n-2);
    }
}
