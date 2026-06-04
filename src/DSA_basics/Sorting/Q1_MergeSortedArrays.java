package DSA_basics.Sorting;

class Q1_MergeSortedArrays {
    void main() {
    }
    void mergeArrays(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
