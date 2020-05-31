package cn.maxzeng.algorithm.Array;

/**
 * @ClassName MissingNumber
 * @Description TODO
 * @Author max.zeng
 * @Date 2020/5/31 22:08
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (j + i)/2;
            if(m == nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
