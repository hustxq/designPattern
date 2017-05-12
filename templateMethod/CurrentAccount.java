package templateMethod;

/**
 * Created by xq on 2017/5/12.
 */
public class CurrentAccount extends Account {
    @Override
    public void calc(String u) {
        System.out.println(String.format("%s, 按照活期计算利息",u));
    }
}
