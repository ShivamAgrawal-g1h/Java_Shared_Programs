package Pattern_Printing;
import java.util.Scanner;
public class Q39_Hollow_Reverse_StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){ // for spaces
                System.out.print(" ");
            }
            for(int j=1; j<=n+1-i; j++){ // right triangle hz flipped structure
                if(j==1 || i==1 || j==n+1-i) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
