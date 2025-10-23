package Java_Language.Arrays;
import java.util.Scanner;
public class Q14_DuplicateElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.println("duplicate element in the array is : "+arr[i]);
                }
            }
        }
    }
}
