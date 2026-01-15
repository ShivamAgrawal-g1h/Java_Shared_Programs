package Java_Language.Conditionals;

import java.util.Scanner;

class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if (a >= b && a >= c) System.out.printf("%d greater", a);
//        else if (b >= c) System.out.printf("%d is greater", b);
//        else System.out.printf("%d is greater", c);
        //Method-2 :
        System.out.printf("%d is greater", Math.max(a, Math.max(b, c)));
        //Method-3 : Using Ternary operator
        int largest = a>=b? (a>=c? a : c) :(b>=c? b : c);
        System.out.println("greatest among them is "+largest);
    }
}
