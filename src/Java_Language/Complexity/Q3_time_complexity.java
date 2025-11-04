package Java_Language.Complexity;
import java.util.Scanner;
public class Q3_time_complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }
    }
}
