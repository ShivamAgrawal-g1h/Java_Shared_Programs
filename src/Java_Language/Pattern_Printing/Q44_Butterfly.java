package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q44_Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            if(i==n) {
                for(int a=1; a<=2*n-1; a++) {
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }
            for(int j=1; j<=i && j<=(2*n-1)-i+1; j++){
                System.out.print("*"+" ");
            }
            for(int j=1; j<=(2*n-1)-2*i || j<=2*i-(2*n-1)-2; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i && j<=(2*n-1)-i+1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
