package Java_Language.Arrays;
import java.util.Scanner;
public class Q6_TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        TripletSum(arr,x);
    }
    public static void TripletSum(int[] a,int x){
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                for(int k=j+1; k<a.length; k++){
                    if(a[i]+a[j]+a[k]==x){
                        count++;
                        System.out.printf("(%d,%d,%d)\n",a[i],a[j],a[k]);
                    }
                }
            }
        }
        System.out.println("Total Pairs = "+count);
    }
}