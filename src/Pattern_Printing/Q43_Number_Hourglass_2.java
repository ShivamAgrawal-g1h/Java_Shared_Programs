package Pattern_Printing;
import java.util.Scanner;
public class Q43_Number_Hourglass_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            int a =1;
            for(int j=1; j<=i-1 && j<=(2*n-1)-i; j++){
                System.out.print(" ");
                a++;
            }
            for(int j=1; j<=n-i+1 || j<=i-n+1; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
