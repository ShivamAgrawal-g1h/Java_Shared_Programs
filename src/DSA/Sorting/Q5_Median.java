package DSA.Sorting;

class Q5_Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int m = nums1.length;
             int n = nums2.length;

             int[] c = new int[m+n];
             int i=0, j=0, idx = 0;
             while(i<m && j<n){
                 if(nums1[i]<nums2[j]) c[idx++] = nums1[i++];
                 else c[idx++] = nums2[j++];
             }
             while(i<m) c[idx++] = nums1[i++];
             while(j<n) c[idx++] = nums2[j++];

             if((m+n)%2 == 0)
             {
                 int m1 = (m+n)/2;
                 int m2 = m1-1;
                 return (double)(c[m1]+c[m2])/2;
             }
             else return c[(m+n)/2];
         }
}
