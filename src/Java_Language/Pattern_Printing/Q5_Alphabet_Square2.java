package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q5_Alphabet_Square2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1+96; j<=n+96; j++){
                char x = (char)j;
                System.out.print(x);
            }System.out.println();
        }
    }
}
