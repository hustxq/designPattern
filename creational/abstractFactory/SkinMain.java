package creational.abstractFactory;

/**
 * Created by xq on 2017/4/23.
 */
public class SkinMain {
    public static void main(String[] args) {
        Button button = new SkinFactory1().createButton();
        TextView textView = new SkinFactory1().createTextView();
        button.display();
        textView.display();
    }
}
