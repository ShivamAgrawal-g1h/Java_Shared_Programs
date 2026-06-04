package DSA.Sorting;

import java.util.Arrays;
import java.util.Comparator;

class QuickSort {
    void main() {
        int[] arr = {7,1,5,3,2,5};
        int[] ar = {5,7,6,3,2,1,4};

        quickSort(arr,0,arr.length-1);
        for(int ele : arr) System.out.print(ele + " ");
    }
    void quickSort(int[] arr, int low, int high) {

        for(int i=low; i<high+1; i++) System.out.print(arr[i] + " ");
        System.out.println();
        if(low>=high) return;

        int p = partition(arr,low,high);

        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    int partition(int[] arr, int l, int h){
        int p = h;
        int[] temp = new int[h-l+1];
        int idx = 0;
        for(int i=l; i<h+1; i++)
            if(arr[i]<=arr[p] && i!=p) temp[idx++] = arr[i];
        int store = idx+l;
        temp[idx++] = arr[p];
        for(int i=l; i<h+1; i++)
            if(arr[i]>arr[p]) temp[idx++] = arr[i];
        idx = 0;
        for(int i=l; i<h+1; i++)
            arr[i] = temp[idx++];
        return store;
    }

    // Lomuto Partion

    int lpartition(int[] arr, int l, int h){
        int p = h;
        int i =l-1;
        for(int j=l; j<h; j++){
            if(arr[j]<arr[p]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[p];
        arr[p] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    int lpartition(int[] arr, int l, int h, int p){
        int pivot = arr[p];
        arr[p] = arr[h];
        arr[h] = pivot;

        int i =l-1;
        for(int j=l; j<h; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[h];
        arr[h] = arr[i+1];
        arr[i+1] = pivot;
        return i+1;
    }

    // Hoare partition
    int hpartition(int arr[], int l, int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{ i++; } while(arr[i]<pivot);
            do{ j--; } while(arr[j]>pivot);
            if(i>=j)return j;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

}
