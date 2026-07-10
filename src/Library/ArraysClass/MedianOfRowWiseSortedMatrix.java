package Library.ArraysClass;

import java.util.Arrays;

class MedianOfRowWiseSortedMatrix {
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n*m];
        int idx = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                arr[idx++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[(n*m)/2];
    }


    public int median2(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n*m];
        int idx = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                arr[idx++] = mat[i][j];
            }
        }
        int k = (n*m+1)/2;
        idx = quickSelect(arr,k);
        if(idx == -1) return -1;
        else return arr[idx];
    }
    public int quickSelect(int[] arr, int k){
        int n = arr.length;
        int l = 0, h = n-1;
        while(l<=h){
            int p = lpartition(arr,l,h);
            if(p==k-1) return p;
            else if(p>k-1) h = p-1;
            else l = p+1;
        }
        return -1;
    }
    int lpartition(int[] arr, int l, int h){
        int p = h;
        int i =l-1;
        for(int j=l; j<h; j++){
            if(arr[j]<arr[p]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[p];
        arr[p] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }



    public int median3(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int min = mat[0][0], max = mat[0][c-1];
        for(int i = 0; i<r; i++){
            min = Math.min(min,mat[i][0]);
            max = Math.max(max,mat[i][c-1]);
        }
        int medianPosition = (r*c+1)/2;
        while(min < max){
            int x = (min+max)/2;
            int count = 0;
            for(int i = 0; i<r; i++){
                int q = binSearch(mat[i],x);
                count += q;
            }
            if(count < medianPosition){
                min = x+1;
            }
            else max = x;
        }
        return min;
    }
    public int binSearch(int[] arr, int tar){
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == tar){
                i = mid+1;
            }
            if(arr[mid] > tar) j = mid-1;
            else i = mid+1;
        }
        return i;
    }
}
