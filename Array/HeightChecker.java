package cn.maxzeng.algorithm.Array;

/**
 * @ClassName HeightChecker
 * @Description 高度检查器 https://leetcode-cn.com/problems/height-checker/
 * @Author max.zeng
 * @Date 2020/5/31 23:00
 */
public class HeightChecker {
    /**
     * 先排序 再比较
     * 时间复杂度 O(nLog(n))
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        //只要计算有多少人在他原本的位置就行
        int[] heights2 = heights.clone();
        for(int i = 0; i < heights2.length; i++) {
            for(int j = 0; j < heights2.length - i - 1; j++) {
                int temp = heights2[j];
                if(heights2[j] > heights2[j+1]) {
                    heights2[j] = heights2[j+1];
                    heights2[j+1] = temp;
                }
            }
        }
        int re = 0;
        for(int m = 0; m < heights2.length; m++) {
            if(heights2[m] != heights[m]) {
                re++;
            }
        }
        return re;
    }

    /**
     * 桶排序 先设置101个桶，然后数据组装到对应的桶里，再依次取出来，不等于key就+1
     * 时间复杂度 O(n+100) = O(n)
     * 空间复杂度 O(1)
     * @param heights
     * @return
     */
    public int heightChecker2(int[] heights) {
        // 值的范围是1 <= heights[i] <= 100，因此需要1,2,3,...,99,100，共101个桶
        int[] arr = new int[101];
        // 遍历数组heights，计算每个桶中有多少个元素，也就是数组heights中有多少个1，多少个2，。。。，多少个100
        // 将这101个桶中的元素，一个一个桶地取出来，元素就是有序的
        for (int height : heights) {
            arr[height]++;
        }

        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            while (arr[i]-- > 0) {
                // 从桶中取出元素时，元素的排列顺序就是非递减的，然后与heights中的元素比较，如果不同，计算器就加1
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }
}
