package Decorator;

/**
 * Created by xq on 2017/5/8.
 */
public class ComponentDecorator extends Component {
    private Component c;
    public ComponentDecorator(Component c){
        this.c = c;
    }
    @Override
    public void display() {
        c.display();
    }
}
