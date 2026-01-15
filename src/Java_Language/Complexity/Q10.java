package Java_Language.Complexity;
import java.util.Scanner;
import static java.lang.Math.pow;
class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<n; i = (int)pow(i,3)){
            System.out.println("loglogn");
        }
    }
}
