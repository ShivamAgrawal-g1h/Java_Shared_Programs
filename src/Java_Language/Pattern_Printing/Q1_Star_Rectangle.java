package Java_Language.Pattern_Printing;
import java.util.Scanner;
public class Q1_Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(String.class.getClassLoader());/// Prints null (Because it's Primordial/Bootstrap!)
        System.out.println(java.sql.SQLException.class.getClassLoader()); /// Check a class from the SQL package
        System.out.println(Q1_Star_Rectangle.class.getClassLoader()); ///// Prints AppClassLoader
    }
}
