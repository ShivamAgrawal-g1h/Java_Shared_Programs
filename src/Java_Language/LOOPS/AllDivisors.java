package Java_Language.LOOPS;
import java.util.Scanner;
class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("All divisors of %d are : ",n);
        for(int i=1; i<=n; i++){
            if(n%i==0) System.out.print(i+" ");
        }
    }
}
