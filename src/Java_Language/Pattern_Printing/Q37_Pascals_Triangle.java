package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q37_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            // Pyramid Structure Type-2
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int x = 1; // every line starts with 1
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x = x* (i-j)/(j); // (next term) = (previous term)*((i-j_previous)/j)  --> Less Intutive , remember this
            }
            System.out.println();
        }
    }
}
