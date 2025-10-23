package Java_Language.Methods;
public class CommandLineExample {
        public static void main(String[] args) {
            System.out.println("Program Starts");
            System.out.println("Number of arguments: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }

            // Example: Convert arguments to integers and add them
            if (args.length >= 2) {
                System.out.println(args[0]+" "+args[1]);
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("Sum of first two numbers: " + (a + b));
            }
        }
}