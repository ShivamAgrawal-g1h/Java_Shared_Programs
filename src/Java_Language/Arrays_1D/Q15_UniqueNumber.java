package Java_Language.Arrays;
import java.util.Scanner;
public class Q15_UniqueNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            boolean found = true;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    found = false;
                }
            }
            if(found) {
                System.out.println("The unique number is : "+arr[i]);
                break;
            }
        }
    }
}
