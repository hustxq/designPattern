package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public class PieChart implements Chart{
    public PieChart(){
        System.out.println("创建饼状图");
    }
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
