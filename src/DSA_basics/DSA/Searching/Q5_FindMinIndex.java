package DSA.Searching;
class Q5_FindMinIndex {
    void main() {
        int[] arr = {9, 7, 1, 2, 3, 6, 10};
        int idx = findMinIndex(arr);
        System.out.println(idx);
    }
//    public int findMinIndex(int[] arr) {
//        // code here
//        int l = 0;
//        int r = arr.length - 1;
//
//        while(l <= r){
//            int mid = l + (r - l)/2;
//            if(l==r) return l;
//            else if(arr[mid] > arr[mid+1])
//                l = (mid) + 1 ;
//            else
//                r = (mid+1)-1;
//        }
//
//        return l; // or return r  // index of minimum
//    }

    public int findMinIndex(int[] arr) {
        // code here
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if(arr[mid1]==arr[mid2]){
                // here mid1 = mid2 i.e. r-l = 0 , so r=l
                break;
            }
            else if (arr[mid1] < arr[mid2])
                r = mid2 - 1;
            else
                l = mid1 + 1;
        }

        return r;// or return l
    }
}
