package Library.PriorityQueue;

import java.util.PriorityQueue;

class Q1_kLargest {
    static void kLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<k; i++) pq.add(arr[i]);
        for(int i = k; i<arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        for(int x : pq){ // if order doesn't matter
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i = 0; i<k; i++){
            System.out.print(pq.poll()+" ");
        }
    }

    static void main() {
        int[] arr = {2,5,3,8,7,1,5,8,9,4};
        kLargest(arr,5);
    }
}
