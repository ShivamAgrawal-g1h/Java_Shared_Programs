package DSA.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Built_In_Methods {
    void main() {
        int[] arr = {2,4,8,10,12,15,20,21,25}; // index of 10 - 3, size of arr - 9
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,3,8,10)); // from index inclusive
        System.out.println(Arrays.binarySearch(arr,4,8,10));
        System.out.println(Arrays.binarySearch(arr,2,4,10));
        System.out.println(Arrays.binarySearch(arr,2,3,10));// to index exclusive


        List al = new ArrayList();
        al.add(1); al.add(2); al.add(3);
        al.add(10); al.add(20); //al.add("Learning");

        // 10 is present at index 3.
        int index1 = Collections.binarySearch(al, 10);
//        int index2 = Collections.binarySearch(al, "Learning");
        System.out.println("found at idx : "+index1);

        List a = new ArrayList();
        a.add(100);a.add(50);a.add(30);
        a.add(10);a.add(2);

        // The last parameter specifies the comparator method
        // used for sorting.
        int index2 = Collections.binarySearch(a, 50,
                Collections.reverseOrder());

        System.out.println("found at idx " + index2);
    }
}
