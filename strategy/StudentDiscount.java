package strategy;

/**
 * Created by xq on 2017/5/12.
 */
public class StudentDiscount implements Discount<Double> {

    @Override
    public Double calc(Double price) {
        System.out.println("学生票:");
        return price*0.8;
    }
}
