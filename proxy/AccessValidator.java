package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class AccessValidator {
    public boolean validate(String uid){
        if ("xq".equals(uid)){
            System.out.println(String.format("%s,验证通过",uid));
            return true;
        }
        System.out.println(String.format("%s,验证失败", uid));
        return false;
    }
}
