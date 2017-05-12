package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public class ChartFactory {
//    静态工厂
    public static Chart product(String s) throws Exception {
        Chart chart = null;
        if (s.equalsIgnoreCase("histogram")){
            chart = new HistogramChart();
        }else if (s.equalsIgnoreCase("pie")){
            chart = new PieChart();
        }else if (s.equalsIgnoreCase("Line")){
            chart = new LineChart();
        }else {
            throw new Exception("不支持此类型图");
        }
        return chart;
    }
}
