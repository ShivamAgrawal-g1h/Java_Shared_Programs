package DSA_basics.Recursion;
import java.util.Scanner;
class Q1_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of n = "+fact(n));
    }
    static int fact(int n){
        if(n==0) return 1;     //base case
        return n*fact(n-1); //recurrence relation
    }
}
