package cn.maxzeng.algorithm.string;

/**
 * @ClassName ReverseOnlyLetters
 * @Description 仅仅反转字母 https://leetcode-cn.com/problems/reverse-only-letters/
 * @Author max.zeng
 * @Date 2020/5/29 0:36
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if(Character.isLetter(S.charAt(i))) {
                while(!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
}
