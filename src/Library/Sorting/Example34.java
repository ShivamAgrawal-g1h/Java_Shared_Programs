package Library.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Example34 {
    static void main() {
        Integer[] arr = {5,20,10,12};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


        arr = new Integer[]{5,20,10,3,12};
        Arrays.sort(arr,new MyCmp());
        System.out.println(Arrays.toString(arr));
    }
}
class MyCmp implements Comparator<Integer> {
    public int compare(Integer a, Integer b){
        return a%2 - b%2;
    }
}
