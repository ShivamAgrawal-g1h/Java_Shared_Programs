package Java_Language.Conditionals;

import java.time.Year;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0)
            System.out.println("Leap Year");
        else if(year%400==0)
            System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
        //Method-2
//        Year y = Year.of(year);
//        boolean is_Leap = y.isLeap();
//        if(is_Leap) System.out.println("Leap Year");
//        else System.out.println("Not a Leap Year");
    }
}
