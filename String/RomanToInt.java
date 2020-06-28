package cn.maxzeng.algorithm.String;

import java.util.HashMap;

/**
 * @ClassName RomanToInt
 * @Description 罗马数字转整数
 * @Author max.zeng
 * @Date 2020/5/10 21:46
 */
public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);

        int total = 0;
        for (int n = 0; n < s.length(); n++) {
            String str = String.valueOf(s.charAt(n));
            String nextStr;
            if(n == s.length() - 1) {
                nextStr = "";
            } else {
                nextStr = String.valueOf(s.charAt(n+1));
            }
            String joinStr = str + nextStr;
            if(hashMap.get(joinStr) == null) {
                total = total + hashMap.get(str);
            } else {
                total = total + hashMap.get(joinStr);
                n++;
            }
        }
        return total;
    }
}
