package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q33_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        // Method-1
//        int nsp = 1, nst = n-1;
//        for(int i=1; i<=n-1; i++){
//            for(int j=1; j<=nst; j++){
//                System.out.print("* ");
//            }
//            for(int j=1; j<=nsp; j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=nst; j++){
//                System.out.print("* ");
//            }
//            nst -= 1;
//            nsp += 2;
//            System.out.println();
//        }

        // Method-2
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=(n-1)+1-i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(n-1)+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
