package Pattern_Printing;
import java.util.Scanner;
public class Q8_Alphabet_Square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char x = (char)(i+96);
                System.out.print(x+" ");
            }System.out.println();
        }
    }
}