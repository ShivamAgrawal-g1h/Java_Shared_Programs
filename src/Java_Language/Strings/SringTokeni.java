package Java_Language.Strings;
import java.util.StringTokenizer;
class SringTokeni {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java String 1 Example");
        String str1 = st.nextToken();
        String str2 = st.nextToken(" ");
        // we can specify the delimiters( eg: " ","\n",etc.) to tokenize
        // the next substring acc. to our needs
        int a = Integer.parseInt(st.nextToken());
        String str3 = st.nextToken();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(a);
        System.out.println(str3);
    }
}
