package templateMethod;

/**
 * Created by xq on 2017/5/12.
 */
public class SavingAccount extends Account {
    @Override
    public void calc(String u) {
        System.out.println(String.format("%s , 按照定期计算利息", u));
    }

    /*@Override
    private void display() {
        super.display();
    }*/

    @Override
    public void display(){
        System.out.println("定期利息计算并显示完成");
    }
}
