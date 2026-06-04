package DSA.Sorting;

class Q11_ArrangeTheArray {
    static void main() {
        int[] arr = {1, 2, -7, 82, -88, 9, 10};
        Rearrange(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void Rearrange(int[] arr){
        int n = arr.length;
        int idx = 0;
        int[] aux = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] < 0) aux[idx++] = arr[i];
        }
        for(int i=0; i<n; i++){
            if(arr[i] > 0) aux[idx++] = arr[i];
        }
        for(int i=0; i<n; i++) arr[i] = aux[i];
    }
}
