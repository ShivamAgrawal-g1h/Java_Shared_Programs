package Library.ArraysClass;

import java.util.Arrays;

class CompareMethod {
    static void main() {
        int[] a = {10,20,15};
        int[] b = {10,20,30};
        System.out.println(Arrays.compare(a,b));

        a = new int[]{10,20,30,40};
        System.out.println(Arrays.compare(a,b));

        b = new int[]{10,40,30};
        System.out.println(Arrays.compare(a,b));


        Integer[] a2 = {10,20,null,15};
        Integer[] b2 = {10,20,-30,40};
        System.out.println(Arrays.compare(a2,b2));

        String[] a3 = {"GFG","IDE"};
        String[] b3 = {"gfg","ide"};
        System.out.println(Arrays.compare(a3,b3,String::compareToIgnoreCase));


    }
}
