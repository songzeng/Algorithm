package cn.maxzeng.algorithm.String;

/**
 * @ClassName ReverseStr
 * @Description 反转字符串 II
 * @Author max.zeng
 * @Date 2020/5/17 18:06
 */
public class ReverseStr {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}
