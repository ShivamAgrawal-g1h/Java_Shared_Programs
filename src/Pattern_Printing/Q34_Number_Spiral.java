package Pattern_Printing;
import java.util.Scanner;
public class Q34_Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                // Method-1
//                int a = 2*n-i, b = 2*n-j;
//                if(i<=j && i<=a && i<=b) System.out.print(i+" ");
//                else if(j<i && j<=a && j<=b) System.out.print(j+" ");
//                else if(a<i && a<j && a<=b) System.out.print(a+" ");
//                else System.out.print(b+" ");
                // Method-2
                int a = i, b = j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
