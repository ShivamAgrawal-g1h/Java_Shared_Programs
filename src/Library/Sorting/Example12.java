package Library.Sorting;

import java.util.Arrays;

class Example12 {
    static void main() {
        int[] arr1 = {5,20,12,30};
        char[] arr2 = {'B','B','A','C','A'};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1 = new int[]{5,30,20,10,8};
        Arrays.sort(arr1,1,4);
        System.out.println(Arrays.toString(arr1));
    }
}
