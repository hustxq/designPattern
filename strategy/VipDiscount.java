package strategy;

/**
 * Created by xq on 2017/5/12.
 */
public class VipDiscount implements Discount<Double> {
    @Override
    public Double calc(Double price) {
        System.out.println("VIP票:");
        System.out.println("增加积分！");
        return price*0.5;
    }
}
