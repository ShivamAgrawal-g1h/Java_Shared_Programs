package Java_Language.OOPs;

public class FinalReferenceVariable {
    public static void main(String[] args) {
        final StringBuffer str = new StringBuffer("Learning");
        str.append("IsFun");
        final int[] arr = {6,78,92,11,64};
        arr[2] += 8;
        System.out.println(arr[2]);
        System.out.println(str);

    }
}
