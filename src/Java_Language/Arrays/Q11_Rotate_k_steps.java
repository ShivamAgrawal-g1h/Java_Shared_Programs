package Java_Language.Arrays;
import java.util.Scanner;
public class Q11_Rotate_k_steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(); // number of rotations
//        for(int i=0; i<k; i++){
//            int last = arr[n-1];
//            for(int j=n-1; j>0; j--){
//                // right shift
//                arr[j] = arr[j-1];
//            }
//            arr[0] = last;
//        }
        arr = reverse(arr,0,n-1);
        arr = reverse(arr,0,k-1);
        arr = reverse(arr,k,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverse(int[] a,int s, int e){
        for(int i=s, j=e; i<j; i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
