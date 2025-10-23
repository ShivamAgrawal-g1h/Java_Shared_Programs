package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q23_Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n%2==0){
                    if(i==n/2 || i==(n+2)/2 || j==n/2 || j==(n+2)/2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else{
                    if(i==(n+1)/2 || j==(n+1)/2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
