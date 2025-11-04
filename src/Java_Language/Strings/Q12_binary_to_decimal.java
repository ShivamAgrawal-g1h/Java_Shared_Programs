package Java_Language.Strings;
import java.util.Scanner;
public class Q12_binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        bin_to_dec(b);
    }
    public static void bin_to_dec(String b) {
        // Code here
        int n = b.length();
        int dec = 0;
//        for(int i=0; i<n; i++){
//            if(b.charAt(i)=='1'){
//                int place_value = 1;
//                for(int j=0; j<n-1-i; j++){
//                    place_value *= 2;
//                }
//                dec += place_value;
//            }
//        }
        int p=1;
        for(int i=n-1; i>=0; i--){
            dec += p*(b.charAt(i)-'0');
            p = p*2;
        }
        System.out.println(dec);
    }
}
