package strategy;

/**
 * Created by xq on 2017/5/12.
 */
public class ChildDiscount implements Discount<Double> {
    @Override
    public Double calc(Double price) {
        System.out.println("儿童票:");
        return price - 10;
    }
}
