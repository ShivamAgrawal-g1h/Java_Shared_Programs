package Java_Language.Arrays;
import java.util.Scanner;
public class Q7_MaxAndSecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0], smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>smax) smax = arr[i];
        }
//        for(int i=0; i<n; i++){
//            if(smax<arr[i] && arr[i]<max) smax = arr[i];
//        }
        if(max == smax) System.out.println(max+" And no second max");
        else System.out.println(max+" "+smax);
    }
}
