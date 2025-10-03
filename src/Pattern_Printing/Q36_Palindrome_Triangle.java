package Pattern_Printing;
import java.util.Scanner;
public class Q36_Palindrome_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int a = i;
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Method-1
//            boolean flag = true;
//            for(int j=1; j<=2*i-1; j++){ // Pyramid Structure TYPE-1
//                System.out.print(a+" ");
//                if(a==1) flag = false;
//                if(flag) a--;
//                else a++;
//            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(a+" ");
                if(j<i) a--;
                else a++;
            }
            System.out.println();
        }

    }
}
