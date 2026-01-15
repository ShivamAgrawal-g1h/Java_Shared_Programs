package Java_Language.InputOutput;
import java.io.PrintWriter;// for faster output
import java.util.Scanner;
class FastIO1 {
    public static void main(String[] args) {
        /*
        1. Scanner Class (easy, less typing, but not recommended very slow):
        The standard Scanner class parses input using regular expressions (Regex),
        which is extremely heavy on the CPU when reading 10^5 or 10^6 integers.
         */
        // EXAMPLE : divisibility check of n numbers by 'k'
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (n-- > 0) {
            int num = sc.nextInt();
            if (num % k == 0) count++;
        }
        //System.out.println(count);
        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        // CRITICAL: Empty the buffer at the end!, PrintWriter: Buffers output and flushes """only""" once at the end.
        out.flush();
    }
}
