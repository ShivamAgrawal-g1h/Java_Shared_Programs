package Library.Sorting;

import java.util.ArrayList;
import java.util.Collections;

class ArrItem
{
    public int item;
    public int index;

    public ArrItem(int item,int index)
    {
        this.item=item;
        this.index=index;
    }
}

class q2_KeepingIndices {
    public ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        ArrayList<ArrItem> al = new ArrayList<>();
        // Create an array of ArrItem objects and sort by item field
        for(int i = 0; i<arr.length; i++) al.add(new ArrItem(arr[i],i));

        Collections.sort(al, (x1, x2) -> x1.item-x2.item );

        return al;
    }
}
