package cn.maxzeng.algorithm.Array;

/**
 * @ClassName Shuffle
 * @Description 重新排列数组 https://leetcode-cn.com/problems/shuffle-the-array/
 * @Author max.zeng
 * @Date 2020/6/7 22:03
 */
public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int i=1;//前半部分指针
        int j=n;//后半部分指针

        int[] res=new int[nums.length];
        int len=nums.length-1;//头和尾都不需要动
        res[0]=nums[0];
        res[len]=nums[len];

        int k=1;
        while(k<len){
            res[k++]=nums[j++];
            res[k++]=nums[i++];
        }
        return res;
    }
}
