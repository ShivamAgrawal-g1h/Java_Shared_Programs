package DSA_basics.Sorting;

class Q9_TwoTypeEle {
    static void main() {
        int[] arr = {1, 2, -3 , 6, 8, 4, -5, 7};
        segNegPos2(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
    static void segNegPos(int[] arr){
        int n = arr.length;
        // here pivot = 0;
        int i = -1, j = n;
        while(true){
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j) return;
            arr[i] = arr[j] + (arr[j] = arr[i]) - arr[i];
        }
    }
    static void segNegPos2(int[] arr){
        int n = arr.length;
        // here pivot = 0;
        int i = -1, j = 0;
        while(j<n){
            if(arr[j]<0) {
                //arr[++i] = arr[j] + (arr[j++] = arr[i]) - arr[i];
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            else j++;
        }
    }

}
