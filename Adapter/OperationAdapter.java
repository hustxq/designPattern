package Adapter;

/**
 * Created by xq on 2017/5/2.
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sort;
    private BinarySearch search;

    public OperationAdapter(){
        sort = new QuickSort();
        search = new BinarySearch();
    }

    @Override
    public int[] sort(int[] iarr) {
        return sort.quickSort(iarr);
    }

    @Override
    public int search(int[] iarr, int key) {
        return search.binarySearch(iarr,key);
    }
}
