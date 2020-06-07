package cn.maxzeng.algorithm.Array;

/**
 * @ClassName CheckPossibility
 * @Description 非递减数列 https://leetcode-cn.com/problems/non-decreasing-array/
 * @Author max.zeng
 * @Date 2020/6/1 22:51
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                if(i == 0) {
                    nums[i] = nums[i+1];
                } else {
                    if(nums[i+1] > nums[i-1]) {
                        nums[i] = nums[i-1];
                    } else {
                        nums[i+1] = nums[i];
                    }
                }
                count++;
                if(count>1) {
                    return false;
                }
            }
        }
        return count > 1 ? false : true;
    }
}
