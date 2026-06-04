package DSA_basics.Searching;
//Ques. Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element
//      in arr[] that is greater than or equal to x. This element is called the ceil of x.
//      If such an element does not exist, return -1.
//
//Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.
class Q3_Ceil {
    public int findCeil(int[] arr, int x) {
        // code here
        int idx = -1;
        for(int i=0, j=arr.length-1; i<=j;){
            int mid = (i+j)/2;
            //if(arr[mid]==x) return mid;
            if(arr[mid]>=x){
                idx = mid;
                j = mid-1;
            }
            else i = mid+1;
        }
        return idx;
    }
}
