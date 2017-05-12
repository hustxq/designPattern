package creational.abstractFactory;

/**
 * Created by xq on 2017/4/23.
 */
public class SkinFactory1 implements AbstractSkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextView createTextView() {
        return new SpringTextview();
    }
}
