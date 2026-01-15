package Java_Language.LOOPS;
import java.util.Scanner;
class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b? a:b;
        int lcm = max;
        for(int i=max; i<=a*b; i++){
            if(a%i==0 && b%i==0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM is :"+lcm);
    }
}
