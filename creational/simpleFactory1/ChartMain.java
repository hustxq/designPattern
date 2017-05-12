package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public class ChartMain {
    public static void main(String[] args) {
        Chart chart = null;
        try {
            chart = ChartFactory.product("line");
            chart.display();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
