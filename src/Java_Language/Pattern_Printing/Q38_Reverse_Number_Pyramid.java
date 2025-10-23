package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q38_Reverse_Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=1; j--){ // for spaces
                System.out.print(" ");
            }
            int a = i;
            for(int j=1; j<=n+1-i; j++){ // right triangle structure
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
