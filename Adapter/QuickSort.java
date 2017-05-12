package Adapter;

/**
 * Created by xq on 2017/5/2.
 */
public class QuickSort {
    public int[] quickSort(int[] iarr){
        sort(iarr,0,iarr.length-1);
        return iarr;
    }

    public void sort(int[] iarr,int s, int e){
        int p = 0;
        if (s<e){
            p = partition(iarr,s,e);
            sort(iarr,s,p-1);
            sort(iarr,p+1,e);
        }
    }

    public int partition(int[] iarr,int s, int e){
        int x = iarr[e];
        int j = s-1;
        for (int i=s; i<e; i++){
            if (iarr[i]<x){
                j++;
                swap(iarr, i, j);
            }
        }
        swap(iarr, j+1, e);
        return j+1;
    }

    public void swap(int[] iarr, int i,int j){
        if (i==j) return;
        int tmp = iarr[i];
        iarr[i] = iarr[j];
        iarr[j] = tmp;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] iarr={84,76,50,69,90,91,88,96,100};
        sort.quickSort(iarr);
        for (int i:iarr) {
            System.out.println(i);
        }
    }
}
