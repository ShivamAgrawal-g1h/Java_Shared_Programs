package DSA.Sorting;
/*
2149. Rearrange Array Elements by Sign
You are given a 0-indexed integer array nums of even length consisting of an equal number
 of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

1.  Every consecutive pair of integers have opposite signs.
2.  For all integers with the same sign, the order in which they were present in nums is preserved.
3.  The rearranged array begins with a positive integer.
4.  Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */
class Q_RearrangeInPairs {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] aux = new int[n];;
        int posIdx = 0, negIdx = 1;
        for(int ele : nums){
            if(ele > 0){
                aux[posIdx] = ele;
                posIdx += 2;
            }
            else if(ele < 0){
                aux[negIdx] = ele;
                negIdx += 2;
            }
        }
        return aux;
    }
}
