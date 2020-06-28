package cn.maxzeng.algorithm.String;

/**
 * @ClassName detectCapitalUse
 * @Description 检测大写字母
 * @Author max.zeng
 * @Date 2020/5/9 23:22
 */
public class DetectCapitalUse {
    public static void main(String[] args) {
        String str = "asdfghjkl";
        boolean res = DetectCapitalUse.detectCapitalUse2("g");
    }
    public static boolean detectCapitalUse2(String word) {
        int j = 0;//小写字母个数
        int k = 0;//大写字母个数
        int m = 0;//首字母是否大写
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!Character.isLowerCase(ch)) {
                k++;
            }
            if(Character.isLowerCase(ch)) {
                j++;
            }
            if(i == 0 && !Character.isLowerCase(ch)) {
                m = 1;
            }
        }
        if(k == word.length() || j == word.length()) {
            return true;
        }
        if(m == 1 && j == word.length() - 1) {
            return true;
        }
        return false;
    }
}
