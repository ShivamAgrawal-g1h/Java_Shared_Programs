//package Pattern_Printing;
//import java.util.Scanner;
//public class Q26_Binary_Triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            int a=1, b=0;
//            for(int j=1; j<=i; j++){
//                if(i%2!=0) System.out.print(a+" ");
//                else System.out.print(b+" ");
//                a = a+b;
//                b = a-b;
//                a = a-b;
//            }
//            System.out.println();
//        }
//    }
//}

// Method-2
package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q26_Binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
