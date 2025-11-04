package Java_Language.Strings;
public class indexOfMethod {
    public static void main(String[] args) {
        String s1 = "geeks for geeks";
        String s2 = "geeks";

        // Find the starting index of s2 in s1
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s2,1));
    }
}
