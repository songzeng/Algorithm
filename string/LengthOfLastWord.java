package cn.maxzeng.algorithm.string;

/**
 * @ClassName LengthOfLastWord
 * @Description 最后一个单词的长度 https://leetcode-cn.com/problems/length-of-last-word/
 * @Author max.zeng
 * @Date 2020/5/27 0:21
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n = 0, m = 0;
        int num = 0;
        while(n<=m && m < s.length()) {
            if(s.charAt(m) == ' ') {
                m++;
                n=m;
            } else {
                m++;
                num = m - n;
            }
        }
        return num;
    }

    /**
     * 官方答案
     * @param s
     * @return
     */
    public int lengthOfLastWord2(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

}
