package DSA_basics.Heap;

class MinHeap{
    int size, capacity;
    int[] arr;
    MinHeap(int c){
        capacity = c;
        arr = new int[c];
    }
    int left(int i){ return 2*i+1; }
    int right(int i){ return 2*i+2; }
    int parent(int i){ return (i-1)/2; }

    boolean insert(int x){ // O(logn) time
        if(size == capacity) return false;
        size++;
        arr[size-1] = x;
        for(int i = size - 1; i != 0 && arr[i] < arr[parent(i)] ; ){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
        return true;
    }

    void heapify(int i){ // O(logn) time
        int lt = left(i), rt = right(i);
        int smallest = i;
        if(lt < size && arr[lt] < arr[i])
            smallest = lt;
        if(rt < size && arr[rt] < arr[smallest])
            smallest = rt;
        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(smallest);
        }
    }
    void heapify_itr(int i){ // O(logn) time
        while (true) {
            int smallest = i;

            int lt = left(i), rt = right(i);

            if (lt < size && arr[lt] < arr[smallest])
                smallest = lt;
            if (rt < size && arr[rt] < arr[smallest])
                smallest = rt;

            if (smallest == i) break;

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            i = smallest;
        }
    }

    int extractMin(){ // O(logn) time
        if(size == 0) return Integer.MAX_VALUE;
        else if(size == 1) return arr[--size];
        int temp = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = temp;
        size--;
        heapify(0);
        return temp;
    }

    void decreaseKey(int i, int x){ // O(logn) time
        if(size <= i) return;
        arr[i] = x;
        while(i != 0 && arr[i] < arr[parent(i)]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }


    void deleteKey(int i){ // O(logn) time
        if(i < 0 || i >= size) return;
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }
    void deleteKey2(int i) { // O(logn) time
        if(i < 0 || i >= size) return;
        int temp = arr[i];
        arr[i] = arr[size-1];
        arr[size-1] = temp;
        size--;
        int idx = i;
        if(idx != 0 && arr[idx] < arr[parent(idx)]){
            for(idx = i; idx != 0 && arr[idx] < arr[parent(idx)] ;){
                int temp2 = arr[idx];
                arr[idx] = arr[parent(idx)];
                arr[parent(idx)] = temp2;
                idx = parent(idx);
            }
        }
        else heapify(i);
    }

    void buildHeap(int[] data){ // O(n) time
        int n = data.length;
        arr = data;
        size = n;
        capacity = n;
        for(int i = (n-2)/2; i>=0 ;i--)
            heapify(i);
    }
}

class Implementation {
    static void main() {
        MinHeap mh = new MinHeap(10);
        mh.insert(20);
        mh.insert(30);
        mh.insert(5);
        mh.insert(44);
        mh.insert(17);
        mh.insert(25);

        mh.deleteKey(2);
        mh.extractMin();
        mh.insert(50);
    }
}
