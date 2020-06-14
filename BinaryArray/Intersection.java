package cn.maxzeng.algorithm.BinaryArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName Intersection
 * @Description 两个数组的交集 https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @Author max.zeng
 * @Date 2020/6/11 22:28
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mappings = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {
            mappings.put(nums1[i], 1);
        }
        List<Integer> re = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if (mappings.containsKey(nums2[i]) && !re.contains(nums2[i])) {
                re.add(nums2[i]);
            }
        }
        int[] array = new int[re.size()];
        for(int i = 0; i < re.size();i++){
            array[i] = re.get(i);
        }

        return array;
    }
}
