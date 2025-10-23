package Java_Language.Methods;
import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        // Method-1
//        int digit = 0;
//        int q2 = q;
//        for(int i=1; q2!=0; i++){
//            q2 = q2/10;
//            digit++;
//        }
//        int fd = q;
//        for(int i=1; i<=digit-1; i++){
//            fd = fd/10;
//            digit--;
//        }
//         if(fd<0) fd = -fd;
//        System.out.println(fd);

//        // Method -2
//        while(q>9 || q<(-9)){
//            q = q/10;
//        }
//        if(q<0) q = -q;
//        System.out.println(q);

        // Method-3
        if(q<0) q = -q;
        int p = (int)Math.log10(q);
        int a = (int)Math.pow(10,p);
        System.out.println(q/a);
    }
}
