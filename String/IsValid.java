package cn.maxzeng.algorithm.String;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName IsValid
 * @Description 有效的括号
 * @Author max.zeng
 * @Date 2020/5/17 17:08
 */
public class IsValid {
    private HashMap<Character, Character> mappings;

    public IsValid() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        if(s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(this.mappings.containsKey(c)) {

                char topElement = stack.empty() ? '#' : stack.pop();

                if(topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
