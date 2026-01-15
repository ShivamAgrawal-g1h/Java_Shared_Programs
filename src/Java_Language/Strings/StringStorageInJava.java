package Java_Language.Strings;

class StringStorageInJava {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        String str5 = new String("Intern");
        String str6 = str5.intern();
        String str7 = "Intern";
        System.out.println(str6 == str7);
    }
}
