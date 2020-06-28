package cn.maxzeng.algorithm.String;

/**
 * @ClassName BalancedStringSplit
 * @Description 分割平衡字符串 https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @Author max.zeng
 * @Date 2020/5/24 10:34
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int i = 0, rn = 0, ln = 0;
        int count = 0;
        while(i < s.length()) {
            char fisrt = s.charAt(i);
            if(fisrt == 'R') rn++;
            if(fisrt == 'L') ln++;
            if(rn == ln) {
                count++;
                rn = ln = 0;
            }
            i++;
        }
        return count;
    }
}
