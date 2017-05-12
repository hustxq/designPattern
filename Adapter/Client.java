package Adapter;

/**
 * Created by xq on 2017/5/2.
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        operation.sort(scores);
        /*for (int i:scores){
            System.out.print(i+" ");
        }*/
        System.out.println("查找成绩90：");
        int score = operation.search(scores,90);
        if (score!= -1){
            System.out.println("find");
        }else{
            System.out.println("Not found");
        }
    }
}
