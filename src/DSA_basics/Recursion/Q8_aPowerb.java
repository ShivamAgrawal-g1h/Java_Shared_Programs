package DSA_basics.Recursion;
import java.util.Scanner;
class Q8_aPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Its cube is : "+power(n,3));
    }
    static long power(int a, int b){
        if(b==1) return a;
        return a*power(a,b-1);
    }
}
