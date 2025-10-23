package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q7_Alphabet_Square3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char x = (char)(i+64);
                System.out.print(x);
            }System.out.println();
        }
    }
}
