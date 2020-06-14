package cn.maxzeng.algorithm.BinaryArray;

/**
 * @ClassName NextGreatestLetter
 * @Description 寻找比目标字母大的最小字母 https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * @Author max.zeng
 * @Date 2020/6/12 23:55
 */
public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(letters[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return letters[lo % letters.length];
    }
}
