package Java_Language.Strings;
public class Objects_StringLiteral_vs_new_keyword {
    public static void main(String[] args) {
        // String creation using literals
        String s1 = "geek";
        String s2 = "geek";

        // Comparing string literals
        if (s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");

        // String creation using the new keyword
        String s3 = new String("geek");

        // Comparing literal with object created using 'new'
        if (s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
