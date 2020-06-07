package cn.maxzeng.algorithm.Array;

/**
 * @ClassName SearchInsert
 * @Description 搜索插入位置 https://leetcode-cn.com/problems/search-insert-position/
 * @Author max.zeng
 * @Date 2020/6/7 10:24
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
