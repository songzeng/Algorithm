package cn.maxzeng.algorithm.BinaryArray;

/**
 * @ClassName ArrangeCoins
 * @Description TODO
 * @Author max.zeng
 * @Date 2020/6/8 23:23
 */
public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int min = n - 1;
        for(int i = 1; i < n; i++) {
            if(min < (i+1)) {
                return i;
            } else {
                min = min - i - 1;
            }
        }
        return n;
    }
}
