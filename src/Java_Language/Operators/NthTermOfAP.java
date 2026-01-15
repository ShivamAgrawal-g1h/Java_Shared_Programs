package Java_Language.Operators;

import java.util.Scanner;

class NthTermOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        //Method-1 : Naive Solution
//        for(int i=1; i<n; i++){
//            a += d;
//        }
//        System.out.println(a);
        //Method-2 : Expected Approach
        a = a + (n-1)*d;
        System.out.println(a);
    }
}
