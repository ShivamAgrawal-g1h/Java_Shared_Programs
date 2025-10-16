/* Q: you are given a positive number n, you need to return True if it is
within 3 of a multiple of 10.
The multiples of 10 are 0,10,20,30,40,50..... and so on. So within 3 of 0
means -3 to 3, and within 10 means 7 to 13 and similarly for others
*/
package Methods;
import java.util.Scanner;
public class ContestQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<=1+n/10; i++){
            if(n>=(-3+10*i) && n<=3+10*i ) flag = true;
        }
        if(flag) System.out.println("True");
        else System.out.println("False");
    }
}
