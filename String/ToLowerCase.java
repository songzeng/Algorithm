package cn.maxzeng.algorithm.String;

/**
 * @ClassName ToLowerCase
 * @Description 转换成小写字母 https://leetcode-cn.com/problems/to-lower-case/
 * @Author max.zeng
 * @Date 2020/5/24 17:00
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        String str2 = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90) {
                str2 += (char) (ch + 32);
            } else {
                str2 += ch;
            }
        }
        return str2;
    }
}
