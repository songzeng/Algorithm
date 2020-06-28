package cn.maxzeng.algorithm.String;

import java.util.Arrays;

/**
 * @ClassName MaxNumberOfBalloons
 * @Description “气球” 的最大数量 https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * @Author max.zeng
 * @Date 2020/5/29 22:36
 */
public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int num = 0;
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == 'b')
                b++;
            else if (ch == 'a')
                a++;
            else if (ch == 'l')
                l++;
            else if (ch == 'o')
                o++;
            else if (ch == 'n')
                n++;
        }
        l /= 2;
        o /= 2;
        int[] arr = {b, a, l, o, n};
        Arrays.sort(arr);
        num = arr[0];
        return num;
    }
}
