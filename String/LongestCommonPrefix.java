package cn.maxzeng.algorithm.String;

/**
 * @ClassName LongestCommonPrefix
 * @Description 最长公共前缀
 * @Author max.zeng
 * @Date 2020/5/15 22:53
 */
public class LongestCommonPrefix {
    /**
     * 思路就是第一个和第二个比较得到公共序列，用这个公共序列再和第三个比较，以此类推。写法很丑，，，不熟悉Java语法
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs)
    {
        if(strs.length == 0) return "";
        String perv = strs[0];
        String commonStr = "";

        for(int i = 1; i < strs.length; i++) {
            for(int j = 0; j < perv.length() && j < strs[i].length(); j++) {
                if(strs[i].charAt(j) == perv.charAt(j)) {
                    commonStr = commonStr + strs[i].charAt(j);
                } else {
                    break;
                }
            }
            perv = commonStr;
            if(perv == "") {
                return "";
            }
            commonStr = "";
        }
        return perv;
    }

    /**
     * 官方写法，思路和我的一致，写法优雅多了
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs)
    {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
