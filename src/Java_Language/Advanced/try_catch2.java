package Java_Language.Advanced;
// unchecked (runtime) exceptions
//we handle user input errors such as providing insufficient or invalid arguments:
//import java.lang.ArrayIndexOutOfBoundsException;
//import java.lang.NumberFormatException;
class try_catch2 {
    public static void main(String[] args) {
        int a,b,sum;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            sum = a+b;
            System.out.println("Addition is : "+sum);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient nos.");
        }catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
