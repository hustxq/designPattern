package templateMethod;

/**
 * Created by xq on 2017/5/12.
 */
public abstract class Account {
    private boolean validate(String u, String p){
        if ("xq".equals(u)&&"123".equals(p)){
            return true;
        }
        return false;
    }

    public abstract void calc(String u);

    protected void display(){
        System.out.println("计算并显示完成");
    }

    public void handle(String u,String p){
        if (validate(u,p)){
            calc(u);
            display();
        }else {
            System.out.println("用户不合法");
        }
    }
}
