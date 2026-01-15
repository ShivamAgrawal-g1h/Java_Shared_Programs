package Java_Language.LOOPS;
import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a>b? b:a;
        int gcd = 1;
        for(int i=2; i<min; i++){
            if(a%i==0 && b%i==0) gcd = i;
        }
        System.out.println("GCD is : "+gcd);
    }
}
