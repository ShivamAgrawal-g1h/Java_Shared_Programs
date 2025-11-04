package Java_Language.Strings;
public class compareToMehod {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "java";
        // Compare s1 and s2
        int res = s1.compareTo(s2);
        if (res == 0)
            System.out.println("Same");
        else if (res > 0)
            System.out.println("s1 Greater");
        else
            System.out.println("s1 Smaller");
        String s3 = "H e l l o";
        String s4 = "Hello";
        System.out.println(s3.compareTo(s4));
    }
}
