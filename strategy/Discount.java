package strategy;

/**
 * Created by xq on 2017/5/12.
 * 算法的封装与切换，策略注入
 */
public interface Discount<T> {
    T calc(T price);
}
