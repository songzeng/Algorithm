package cn.maxzeng.algorithm.Array;

/**
 * @ClassName FindLengthOfLCIS
 * @Description 最长连续递增序列 https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 * @Author max.zeng
 * @Date 2020/6/3 0:16
 */
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int count = 1;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i+1]) {
                count++;
            } else {
                ans = ans > count ? ans : count;
                count = 1;
            }
        }
        return ans > count ? ans : count;
    }
}
