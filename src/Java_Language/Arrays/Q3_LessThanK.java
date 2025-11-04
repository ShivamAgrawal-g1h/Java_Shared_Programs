package Java_Language.Arrays;
import java.util.Scanner;
public class Q3_LessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = Less_Than_k(a,k);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] Less_Than_k(int[] a,int k) {
        int count =0;
        for(int i=0; i<a.length; i++){
            if(a[i]<k) count++;
        }
        int[] arr = new int[count];
        int q=0;
        for(int i=0; i<a.length; i++){
            if(a[i]<k) {
                arr[q] = a[i];
                q++;
            }
        }
        return arr;
    }
}