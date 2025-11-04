package Java_Language.Advanced;
import java.util.Arrays;
class Q5_MaxAndSumOfArrayUsingStreams {
    public static void main(String[] args) {
        int[] arr = {1,83,19,63,82};
        System.out.println("Sum :"+ Arrays.stream(arr).sum());
        System.out.println("Max :"+Arrays.stream(arr).max().getAsInt());
    }
}
