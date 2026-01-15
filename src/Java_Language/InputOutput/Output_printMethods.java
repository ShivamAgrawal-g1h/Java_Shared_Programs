package Java_Language.InputOutput;
class Output_printMethods {
    public static void main(String[] args) {
        int x = 100;
        float z = (float) (Math.PI);
        System.out.printf("Value of PI = %.3f\n",z);
        System.out.printf("Value of PI = %10.2f\n",z);// means at least 10 characters must be printed and only 2 no.s after decimal point should be taken
        System.out.printf("Value of PI = %010.2f\n",z);

        System.out.printf("Value of PI = %2.2f\n",z);// means at least 2 characters must be printed and only 2 no.s after decimal point should be taken

    }
}
/*
System   : It is a final class defined in the java.lang package.
out      : This is an instance of PrintStream type, which is a public and static member field of the System class.
println(): As all instances of the PrintStream class have a public method println(), we can invoke the same on out as well.
          This is an upgraded version of print(). It prints any argument passed to it and adds a new line to the output.
          We can assume that System.out represents the Standard Output Stream.

Just like System.out, Java provides us with two other standard or default input-output streams:

System.in: This is the standard input stream that is used to read characters from the keyboard or any other standard input device.
           Example:  InputStreamReader inp = new InputStreamReader(System.in);
System.err: This is the standard error stream that is used to output all the error data that a program might throw,
            on a computer screen or any standard output device.
            Example:  System.err.print("Error");
 */