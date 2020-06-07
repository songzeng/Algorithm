package cn.maxzeng.algorithm.Array;

import java.util.Arrays;

/**
 * @ClassName MergeArray
 * @Description 合并两个有序数组 https://leetcode-cn.com/problems/merge-sorted-array/
 * @Author max.zeng
 * @Date 2020/6/4 0:24
 */
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num3 = Arrays.copyOfRange(nums1, 0, m);
        int k = 0, j = 0;
        int s = 0;
        while(s < m+n) {
            if(k >= m) {
                nums1[s] = nums2[j];
                j++;
                s++;
                continue;
            }
            if(j >= n) {
                nums1[s] = num3[k];
                s++;
                k++;
                continue;
            }
            if(num3[k] < nums2[j]) {
                nums1[s] = num3[k];
                k++;
            } else {
                nums1[s] = nums2[j];
                j++;
            }
            s++;
        }
    }
}
