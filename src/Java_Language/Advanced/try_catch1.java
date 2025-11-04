package Java_Language.Advanced;
        /*
        try {
    // Write code that might throw exceptions
}
catch (Type1 e1) {
    // Code to handle the Type1 exceptions
}
catch (Type2 e2) {
    // Code to handle the Type2 exceptions
}
finally {
    // Code that is always executed whether exceptions are thrown or not
}
         */
//Compile time exception handling
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class try_catch1 {
    public static void main(String[] args) {
        try (// Attempt to open the file
                Scanner in = new Scanner(new File("test.in"))
        ){// If successful, this statement is executed
            System.out.println("Exit main()");
        } catch (FileNotFoundException ex) {
            // If file is not found, this block executes
            System.out.println("File Not Found caught ...");
        } finally { // OPTIONAL, Always executes, regardless of exception
            System.out.println("finally-block runs regardless of the state of exception");
        }
        // after code will not be executed in case of an uncaught Exception
        System.out.println("After try-catch-finally");
    }
}
// each try ,must be accompanied by at least one catch or finally or resource specification
