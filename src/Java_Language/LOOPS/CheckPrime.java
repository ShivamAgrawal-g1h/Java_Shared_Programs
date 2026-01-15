package Java_Language.LOOPS;
import java.util.Scanner;
class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_prime = true;
        for(int i=2; i*i<n; i++){
            if(n%i==0){
                is_prime = false;
                break;
            }
        }
        if(is_prime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
