package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q42_Number_Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=i-1 && j<=(2*n-1)-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1 || j<=i-n+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
