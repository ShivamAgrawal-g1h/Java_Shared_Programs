package Library.ArraysClass;

import java.util.*;

class AsListMethod {
    static void main() {
        String[] arr = {"GFG","Practice","IDE"};
        List<String> list = Arrays.asList(arr);
        arr[0] = "Courses";
        System.out.println(list);
        list.set(1,"Learn");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

//        int[] a = {10,20,30};
//        HashSet<Integer> set = new HashSet<>(Arrays.asList(a)); //Compiler Error : Incompatible types
    }
}
