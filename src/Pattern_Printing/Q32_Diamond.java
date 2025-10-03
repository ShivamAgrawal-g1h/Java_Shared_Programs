package Pattern_Printing;
import java.util.Scanner;
public class Q32_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Method-1
//        int nsp = n-1, nst = 1;
//        for(int i=1; i<=2*n-1; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=nst; j++){
//                System.out.print("* ");
//            }
//            if(i<n){
//                nsp--;
//                nst += 2;
//            }
//            else{
//                nsp++;
//                nst -= 2;
//            }
//            System.out.println();
//        }

        // Method-2
        int nst = 1;
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=n-i || j<=i-n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            if(i<n) nst += 2;
            else nst -= 2;
            System.out.println();
        }

    }
}
