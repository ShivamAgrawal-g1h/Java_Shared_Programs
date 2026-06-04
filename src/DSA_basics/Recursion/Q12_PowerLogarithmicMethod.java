package DSA_basics.Recursion;
import java.util.Scanner;
class Q12_PowerLogarithmicMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
    static long power(int a,int b){
        if (b < 0)
            throw new IllegalArgumentException("Negative exponent not supported");
        if(b==0) return 1;
        long half = power(a,b/2);
        if(b%2==0) return half*half;
        else return half*half*a;
    }
}
