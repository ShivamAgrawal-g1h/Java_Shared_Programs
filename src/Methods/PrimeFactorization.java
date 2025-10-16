package Methods;
import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The prime factorization of " + n + " is :");
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + "  ");
                n = n / i;
            }
        }
        if (n > 1) {  // if a prime factor remains
            System.out.print(n);
        }
    }
}