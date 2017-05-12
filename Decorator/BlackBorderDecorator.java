package Decorator;

/**
 * Created by xq on 2017/5/8.
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component c) {
        super(c);
    }

    @Override
    public void display() {
        System.out.print("带黑窗体的");
        super.display();
    }
}
