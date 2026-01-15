package Java_Language.Conditionals;
import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Method-1 : - O(1) Time and O(1) Space
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
        //Method-2 : - O(1) Time and O(1) Space
        if((n&1)==0) System.out.println("Even");
        else System.out.println("Odd");

    }
}
