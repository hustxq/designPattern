package Adapter;

/**
 * Created by xq on 2017/5/2.
 */
public class BinarySearch {
    public int binarySearch(int[] iarr, int key){
        int s = 0,e = iarr.length-1;
        int mid = (s+e)>>>1;
        while (s<=e){
//            System.out.println("mid:"+mid);
            if (iarr[mid] == key){
                return mid;
            }else if (iarr[mid]>key){
                e = mid-1;
            }else{
                s = mid+1;
            }
            mid = (s+e)>>>1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] iarr={84,76,50,69,90,91,88,96,100};
        QuickSort sort = new QuickSort();
        sort.quickSort(iarr);
        for (int i:iarr){
            System.out.print(i+" ");
        }
        System.out.println(search.binarySearch(iarr,95));
    }
}
