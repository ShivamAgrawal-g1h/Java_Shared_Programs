package Java_Language.Arrays;
import java.util.Scanner;
public class Q4_SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = Separate(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] Separate(int[] arr){
        int[] ans = new int[arr.length];
        int q=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                ans[q] = arr[i];
                q++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                ans[q] = arr[i];
                q++;
            }
        }
        return ans;
    }
}
