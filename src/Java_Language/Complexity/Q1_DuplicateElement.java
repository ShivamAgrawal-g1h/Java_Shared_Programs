package Java_Language.Complexity;
import java.util.Scanner;
public class Q1_DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++){
            arr[i] = sc.nextInt();
        }
        // Approach-1
//        int ans = 0;
//        for(int i=0; i<n+1; i++){
//            for(int j=i+1; j<n+1; j++){
//                if(arr[i] == arr[j]){
//                    ans = arr[i];
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);

        //Approach-2
//        boolean[] found = new boolean[n+1];
//        for(int i=0; i<n+1; i++){
//            int ele = arr[i];
//            if(found[ele]==true) System.out.println(ele);
//            else found[ele]=true;

        //Approach-3
        int sumArray = 0;
        for(int i=0; i<n+1; i++){
            sumArray += arr[i];
        }
        int sum1to_n = n*((n+1)/2);
        System.out.println(sumArray-sum1to_n);
    }
}
