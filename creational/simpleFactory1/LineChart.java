package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public class LineChart implements Chart {
    public LineChart(){
        System.out.println("创建折线图");
    }
    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
