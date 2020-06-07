package cn.maxzeng.algorithm.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CountCharacters
 * @Description 拼写单词 https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * @Author max.zeng
 * @Date 2020/6/5 23:28
 */
public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        char[] charsArr = chars.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charsArr.length; i++) {
            list.add(charsArr[i]);
        }
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            char[] tmpArr = words[i].toCharArray();
            List<Character> list2 = new ArrayList<>(list);
            int tempLength = 0;
            for(int j = 0; j < tmpArr.length; j++) {
                int limit = list2.indexOf(tmpArr[j]);
                if(limit >= 0) {
                    list2.remove(limit);
                    tempLength = tmpArr.length;
                } else {
                    tempLength = 0;
                    break;
                }
            }
            count = count + tempLength;
        }
        return count;
    }
}
