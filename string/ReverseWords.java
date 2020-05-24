package cn.maxzeng.algorithm.string;

/**
 * @ClassName ReverseWords
 * @Description 反转字符串中的单词 III https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @Author max.zeng
 * @Date 2020/5/24 17:38
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] s2 = s.split(" ");
        String re = "";
        for(int i = 0; i < s2.length; i++) {
            StringBuilder sb = new StringBuilder(s2[i]);
            //双指针
            int left = 0;
            int right = s2[i].length() - 1;
            while(left <= right) {
                char tmp = s2[i].charAt(left);
                sb.replace(left, left+1, String.valueOf(s2[i].charAt(right)));
                sb.replace(right, right+1, String.valueOf(tmp));
                left++;
                right--;
            }
            s2[i] = sb.toString();
            re += s2[i];
            if(i != s2.length - 1) {
                re += " ";
            }
        }
        return re;
    }
}
