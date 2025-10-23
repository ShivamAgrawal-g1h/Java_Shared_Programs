package Java_Language.Arrays;
import java.util.Scanner;
public class Q10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
            arr[i] = Character.toLowerCase(arr[i]);
        }
        boolean flag = true;
        for(int i=0; i<n/2; i++){
            if(arr[i]==' ') continue;
            else if(arr[i]!=arr[n-1-i]){
                flag = false;
                break;
            }
        }
        if(n==0) System.out.println("no input sequence");
        else if(flag) System.out.print("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
