package Java_Language.LOOPS;
import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1,c =1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
