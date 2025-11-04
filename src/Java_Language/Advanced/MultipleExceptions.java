package Java_Language.Advanced;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class MultipleExceptions {
    public static void main (String[] args) {
        try{
            methodA();
            System.out.println("Executed methodA()");
            Scanner file = new Scanner(new File("test.in"));
            System.out.println("Exit main()");
        } catch(ArithmeticException ex){
            System.out.println("ArithmeticException caught ...");
        } catch(FileNotFoundException ex){
            System.out.println("File Not Found Exception caught ...");
        } catch(Exception ex){
            System.out.println("A new type of Exception caught ...");
        } finally{
            System.out.println("finally-block runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally, life goes on...");
    }
    static void methodA(){
        Scanner sc = new Scanner(System.in);
        int a = 5, b , c;
        System.out.println("Enter numeric value for variable b");
        b = sc.nextInt();
        if(b==0)
            throw new ArithmeticException();
        else
            c = a / b;
        System.out.println("Exit methodA()");
    }
}
