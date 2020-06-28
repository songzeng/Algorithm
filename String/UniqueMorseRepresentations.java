package cn.maxzeng.algorithm.String;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UniqueMorseRepresentations
 * @Description 唯一摩尔斯密码词 https://leetcode-cn.com/problems/unique-morse-code-words/
 * @Author max.zeng
 * @Date 2020/5/26 0:18
 */
public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
