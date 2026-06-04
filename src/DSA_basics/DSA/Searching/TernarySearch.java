package DSA.Searching;
//Ternary search is a divide-and-conquer search algorithm used to find the position
// of a target value within a monotonically increasing or decreasing function or in
// a unimodal array (e.g., U-shaped or ∩-shaped).
//
//Unlike binary search, which splits the array into two parts, ternary search divides
// the range into three equal parts by choosing two mid-points:
//
//mid1 = l + (r - l) / 3
//mid2 = r - (r - l) / 3
//
class TernarySearch {
    void main() {
        int[] arr = {29,298,912,1234};
    }
    int ternarySearch(int[] arr, int x){
        int l = 0 , r = arr.length-1;
        while(l<=r){
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;
            if(arr[mid1]==x) return mid1;
            if(arr[mid2]==x) return mid2;
            else if(x<arr[mid1])
                r = mid1-1;
            else if(x>arr[mid2])
                l = mid2+1;
            else{
                l = mid1+1;
                r = mid2-1;
            }
        }
        return -1;
    }
}
