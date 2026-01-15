package Java_Language.InputOutput;

import java.util.Scanner;// imported Scanner class

class InputScanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Create the Scanner object and connect Scanner with System.in by passing it as an argument.
        System.out.println("Enter an Integer : ");
        int a = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter a String : ");
        String b = scn.nextLine();
        System.out.println("You have entered :- "+a+" and name as :- "+b);
    }
}
