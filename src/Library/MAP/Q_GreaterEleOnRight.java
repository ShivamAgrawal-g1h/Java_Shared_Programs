package Library.MAP;

class Pair{
    int idx;
    int data;
    Pair(int i, int d){
        idx = i;
        data = d;
    }
}
class Q_GreaterEleOnRight {
    int[] ans;
    public int[] lowerArray(int[] arr) {
        int n = arr.length;
        Pair[] temp = new Pair[n];
        for(int i = 0; i<n; i++){
            temp[i] = new Pair(i,arr[i]);
        }

        ans = new int[n];

        mergeSort(temp);
        return ans;
    }
    public void mergeSort(Pair[] p){
        int n = p.length;
        if(n==1) return;
        Pair[] a = new Pair[n-n/2];
        Pair[] b = new Pair[n/2];
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = p[idx++];
        for(int i=0; i<b.length; i++) b[i] = p[idx++];

        mergeSort(a);
        mergeSort(b);

        merge(a,b,p);
    }
    public void merge(Pair[] a, Pair[] b, Pair[] p){
        int i = 0, j = 0;
        int k = 0;
        int smallerOnRight = 0;

        while(i<a.length && j<b.length){
            if(a[i].data <= b[j].data){
                ans[a[i].idx] += smallerOnRight;

                p[k++] = a[i++];
            }
            else{
                p[k++] = b[j++];
                smallerOnRight++;
            }
        }

        while(i<a.length){
            ans[a[i].idx] += smallerOnRight;
            p[k++] = a[i++];
        }
        while(j<b.length) p[k++] = b[j++];
    }
}
/*
    public int[] lowerArray(int[] arr) {
        int n = arr.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] ans = new int[n];
        //ans[n-1] = 0;

        int count = sortedTail(arr,n-1);

        for(int i = n-1, j = count; j>0; i--,j--){
            ans[i] = 0;
            hash.put(arr[i], map.getOrDefault(arr[i],0)+1);
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(int i = n-1-count; i>=0; i--){
            int f = 0;
            SortedMap<Integer, Integer> s = map.headMap(arr[i]);
            if(s!=null){
                //f += s.size();

                for(Integer key : s.keySet())
                     f += map.get(key);

            }
            hash.put(arr[i], map.getOrDefault(arr[i],0)+1);
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            ans[i] = f;
        }
        return ans;
    }
    public int sortedTail(int[] arr,int idx){
        int n = arr.length;
        int count = 1; // idx is one element => sorted
        for(int i = idx-1; i>=0; i--){
            if(arr[i] < arr[i+1]) count++;
            else return count;
        }
        return count;
    }
*/
