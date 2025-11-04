package Java_Language.Arrays;
import java.util.Scanner;
public class Q8_CopyReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n];
        for(int i=0; i<n; i++){
            brr[i] = arr[n-1-i];
            System.out.print(brr[i]+" ");
        }
    }
}
