package cn.maxzeng.algorithm.string;

/**
 * @ClassName FindLUSlength
 * @Description 最长特殊序列 Ⅰ
 * @Author max.zeng
 * @Date 2020/5/14 0:17
 */
public class FindLUSlength {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return a.length() > b.length() ? a.length() : b.length();
    }
}
