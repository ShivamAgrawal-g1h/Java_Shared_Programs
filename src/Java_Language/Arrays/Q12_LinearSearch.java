package Java_Language.Arrays;
import java.util.Scanner;
public class Q12_LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        //1 -> all index
        System.out.print("The indices are : ");
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                System.out.print(i+" ");
            }
        }
        //2 -> first index
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                System.out.print(k+" is present at index : "+i);
                break;
            }
        }
        //3 -> last index
        for(int i=n-1;i>=0; i--){
            if(arr[i]==k){
                System.out.print(k+" is present at index : "+i);
                break;
            }
        }
    }
}
