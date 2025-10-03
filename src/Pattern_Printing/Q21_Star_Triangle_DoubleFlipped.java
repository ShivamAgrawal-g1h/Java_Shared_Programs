//package Pattern_Printing;
//import java.util.Scanner;
//public class Q21_Star_Triangle_DoubleFlipped {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i-1; j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

// Method-2
package Pattern_Printing;
import java.util.Scanner;
public class Q21_Star_Triangle_DoubleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n, nsp = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nst--;
            nsp++;
        }
    }
}