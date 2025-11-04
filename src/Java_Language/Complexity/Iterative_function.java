package Java_Language.Complexity;

import java.util.Scanner;

public class Iterative_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addSequence(n));
    }
    public static int addSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }
    public static int pairSum(int x, int y) {
        return x + y;
    }

}
