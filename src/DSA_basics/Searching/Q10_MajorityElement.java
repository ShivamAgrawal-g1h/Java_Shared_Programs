package DSA_basics.Searching;
// Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
//
//Note: A majority element in an array is an element that appears strictly more than arr.length/2 times in the array.

class Q10_MajorityElement {

    // M-1
//    int majorityElement(int[] arr) {
//        // code here
//        int n = arr.length;
//        int ele = -1;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int elem : arr){
//            map.put(elem,map.getOrDefault(elem,0)+1);
//        }
//        for(Integer key : map.keySet()){
//            if(map.get(key)>n/2) ele = key;
//        }
//        return ele;
//    }

    // M-2 : Boyer-Moore Voting algo
    int majorityElement(int[] arr) {
        // code here
        int n = arr.length;
        int candidate = arr[0], count  = 0;
        // Step 1: Find candidate
        for(int ele : arr){
            if(count==0) candidate = ele;
            // wrong : else if(ele == candidate) count++;
            if(ele == candidate) count++;
            else count --;
        }
        // till here we got possible majority element in the candidate variable

        // Step 2: Verify candidate's frequency
        count = 0;
        for(int ele : arr){
            if(ele == candidate) count++;
        }

        return (count>n/2) ? candidate : -1;
    }
}