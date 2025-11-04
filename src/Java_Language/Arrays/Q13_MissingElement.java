package Java_Language.Arrays;
import java.util.Scanner;
public class Q13_MissingElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// range 1 to n
        int[] arr = new int[n-1]; // array has 1 less element
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int totalSum =n*(n+1)/2;
        int actualSum = 0;
        for(int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }
        System.out.println("The left element is : "+(totalSum-actualSum));
    }
}
