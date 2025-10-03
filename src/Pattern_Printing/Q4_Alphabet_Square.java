package Pattern_Printing;
import java.util.Scanner;
public class Q4_Alphabet_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1+64; j<=n+64; j++){
                char x = (char)j;
                System.out.print(x);
            }System.out.println();
        }
    }
}
