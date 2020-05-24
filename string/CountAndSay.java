package cn.maxzeng.algorithm.string;

/**
 * @ClassName CountAndSay
 * @Description 外观数列 https://leetcode-cn.com/problems/count-and-say/
 * @Author max.zeng
 * @Date 2020/5/24 0:00
 */
public class CountAndSay {
    /**
     * 又是题目读起来很难受的题目
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String prevStr = countAndSay(n-1);
        String result = "";
        char num = prevStr.charAt(0);
        int count = 0;
        for(int i = 0; i < prevStr.length(); i++) {
            if (prevStr.charAt(i) != num) {
                result = result + String.valueOf(count) + num;
                num = prevStr.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        return result = result + String.valueOf(count) + num;
    }
}
