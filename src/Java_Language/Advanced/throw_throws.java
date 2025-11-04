package Java_Language.Advanced;

import java.util.Scanner;

class throw_throws {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Exit TRY of main()");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught...");
            /* Prints stack trace for debugging */
            ex.printStackTrace();
        }
        System.out.println("Exit main() successfully");
    }
    public static void methodA() throws ArithmeticException {
        int a = 5;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b == 0) {
            // Throwing an Exception: If the user enters 0, an ArithmeticException
            // is explicitly thrown.
            throw new ArithmeticException("Division by zero");
        }
        int c = a / b;
        System.out.println("Result: " + c);
        System.out.println("Exit methodA()");
    }
}
