package Java_Language.Strings;
public class StringConcat {
    public static void main(String[] args) {
        String s1 = "geeks";
        // s2 references the same object as s1
        String s2 = s1;

        // Concatenating "forgeeks" to s1
        s1 = s1 + "forgeeks";  // OR s1 = s1.concat("forgeeks");
        System.out.println(s1);
        System.out.println(s1 == s2);
    }
}