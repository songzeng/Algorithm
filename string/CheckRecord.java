package cn.maxzeng.algorithm.string;

/**
 * @ClassName CheckRecord
 * @Description 学生出勤记录 I
 * @Author max.zeng
 * @Date 2020/5/22 22:55
 */
public class CheckRecord {
    /**
     * 写的很戳。。穷举。。不过官方推荐的方法3和我一样。。
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        char a = 'A';
        char l = 'L';
        int an = 0;
        for(int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if(n == a) {
                an++;
            }
            if(an > 1) {
                return false;
            }
            if(s.length() >= 3 && i < s.length() - 2 && s.charAt(i) == l && s.charAt(i+1) == l && s.charAt(i+2) == l) {
                return false;
            }
        }
        return true;
    }

    /**
     * 使用正则
     * @param s
     * @return
     */
    public boolean checkRecord2(String s) {
        return !s.matches(".*(A.*A|LLL).*");
    }

}
