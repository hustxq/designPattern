package Decorator;

/**
 * Created by xq on 2017/5/8.
 */
public class ScrollDecorator extends ComponentDecorator {

    public ScrollDecorator(Component c){
        super(c);
    }
    @Override
    public void display() {
        //        新增扩展方法
        System.out.print("可滚动的");
        //        调用原有方法
        super.display();
    }
}
