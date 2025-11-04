package Java_Language.Strings;
public class StringClassMethodsInJava {
    public static void main(String[] args) {
        // 1-5
        System.out.println("GeeksforGeeks".length());// returns 13
        System.out.println("GeeksforGeeks".charAt(3)); // returns  ‘k’
        System.out.println("GeeksforGeeks".substring(10)); // returns “ksforGeeks”
        System.out.println( "GeeksforGeeks".substring(2, 5)); // returns “eks”
        String s1 = "Geeks";
        String s2 = "forGeeks" ;
        String output = s1.concat(s2); // returns “GeeksforGeeks”
        System.out.println(output);

        // 6-10
        String s6 = "Learn Share Learn";
        int output2 = s6.indexOf("Share"); // returns 6
        System.out.println(output2);

        String s7 = "Learn Share Learn";
        int output7 = s7.indexOf("ear",2);// returns 13
        System.out.println(output7);

        String s8 = "Learn Share Learn";
        int output8 = s8.lastIndexOf("a"); // returns 14
        System.out.println(output8);

        System.out.println("Geeks".equals("Geeks")); // returns true
        System.out.println("Geeks".equals("geeks")); // returns false

        System.out.println("Geeks".equalsIgnoreCase("Geeks")); // returns true
        System.out.println("Geeks".equalsIgnoreCase("geeks")); // returns true

        // 11-16
        String s11 = "geeks";
        System.out.println(s11.compareTo("java"));

        String s12 = "Java";
        System.out.println(s12.compareToIgnoreCase("java"));

        String s13 = "JDK";
        System.out.println(s13.toLowerCase());

        String s14 = "learn";
        System.out.println(s14.toUpperCase());

        String s15 = "    LearnShare  Learn ";
        System.out.println(s15.trim()); // prints "Learn Share Learn"

        String s16 = "feeks for feeks";
        String s17 = s16;
        s16 = s16.replace('f','g');
        System.out.println(s16+"\n"+s17);


    }
}
