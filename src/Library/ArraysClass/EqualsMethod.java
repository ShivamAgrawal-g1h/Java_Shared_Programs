package Library.ArraysClass;

import java.util.Arrays;

class EqualsMethod {
    static void main() {
        Integer[] a1 = {10,15,null,30};
        Integer[] b1 = {10,15,null,30};
        System.out.println(Arrays.equals(a1,b1));

        Integer[] a2 = {10,15,null,30};
        Integer[] b2 = {10,15,30,null};
        System.out.println(Arrays.equals(a2,b2));

        String[] a3 = {"GFG","IDE"};
        String[] b3 = {"Gfg","ide"};
        System.out.println(Arrays.equals(a3,b3,String::compareToIgnoreCase));

    }
}
