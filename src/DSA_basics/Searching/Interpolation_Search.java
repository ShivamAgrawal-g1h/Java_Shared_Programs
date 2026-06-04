package DSA_basics.Searching;
/// https://share.google/aimode/yMg9jdKhBxS7uvC0N
///  newton : https://www.geeksforgeeks.org/dsa/newton-forward-backward-interpolation/
/// method/types : https://share.google/aimode/cB75DnhRMFJb5eXQd
class Interpolation_Search {
    int interpolationSearch(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            if(x<arr[low] || x>arr[high]) break;
            // to prevent division by zero
            if(arr[low] == arr[high]){
                if(arr[low] == x) return low;
                else return -1;
            } // for example in arr = {5,5,5,5,5} , x = 5

            int pos = low + ((x - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            if(arr[pos] == x)
                return pos;
            if(arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }
}
