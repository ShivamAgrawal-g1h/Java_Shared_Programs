package Java_Language.Strings;
public class charsMethod {
    public static void main(String[] args) {
        String str = "ABC";
        int[] arr = str.chars().toArray();
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
