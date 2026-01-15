package Java_Language.Operators;

import java.util.Scanner;

class NthTermOfGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        //Method-1 : Naive Approach
//        for(int i=1; i<n; i++){
//            a = a*r;
//        }
//        System.out.println(a);
        a = (int)(a*Math.pow(r,n-1));
        System.out.println(a);
    }
}
