package cn.maxzeng.algorithm.string;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName CanPermutePalindrome
 * @Description 回文排列
 * @Author max.zeng
 * @Date 2020/5/16 11:10
 */
public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        if(s.length() == 0) return false;
        List<String> strList = new LinkedList<String>();
        strList.add(s.substring(0, 1));
        for(int i = 1; i < s.length(); i++)
        {
            String tmp = s.substring(i, i+1);
            if(strList.indexOf(tmp) == -1) {
                strList.add(tmp);
            } else {
                strList.remove(tmp);
            }
        }
        return strList.size() == 1 || strList.size() == 0;
    }
}
