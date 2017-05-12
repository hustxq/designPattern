package Decorator;

/**
 * Created by xq on 2017/5/8.
 */
public class Client {
    public static void main(String[] args) {
        Component w,wWithScroll;
        w = new Window();
        w.display();
        wWithScroll = new ScrollDecorator(w);
        wWithScroll.display();
    }
}
