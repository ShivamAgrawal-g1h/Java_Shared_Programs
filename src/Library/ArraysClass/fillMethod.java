package Library.ArraysClass;

import java.util.Arrays;

class fillMethod {
    static void main() {
        int[][] arr = new int[3][4];
        for(int[] row : arr){
            Arrays.fill(row,1);
            System.out.print(Arrays.toString(row));
        }
    }
}
