package DSA.Searching;

class Q1_SquareRoot {
    // M-1
//    int floorSqrt(int n) {
//        // code here
//        for(int i=0; i<=n; i++){
//            if(i*i==n) return i;
//            if(i*i>n) return (i-1); //root of n ka integral part
//        }
//        return -1;
//    }
    int floorSqrt(int n) {
        int floor = -1;
        for(int i=0,j=n; i<=j;){
            int mid = (i+j)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid<n){
                floor = mid; //possible floor value
                i = mid+1;
            }
            else j = mid-1;
        }
        return floor;
    }
}
