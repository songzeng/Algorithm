package cn.maxzeng.algorithm.BinaryArray;

/**
 * @ClassName KWeakestRows
 * @Description 方阵中战斗力最弱的 K 行 https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
 * @Author max.zeng
 * @Date 2020/6/11 0:58
 */
public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int count = -1,row = mat.length,col = mat[0].length;
        //纵向遍历数组，找出每一列中元素为0的元素
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                //当元素为0，判断是否为第一列，成立则第二个条件为true，否则判断左侧元素是否为0，
                //若左侧元素为0，说明该行已经纳入结果集中，跳过该行。反之，判断当前结果集中的数量
                //是否小于条件K，若成立，将该行纳入结果集中。
                if (mat[j][i] == 0 && (i == 0 ? true : mat[j][i-1] != 0) && count+1 < k){
                    ans[++count] = j;
                }
            }
        }

        //当遍历完整个数组结果集还未满，说明拥有农民的行数是小于K的，这时我们就需要对全为军人的行进行比较
        //,直接遍历数组最后一列，选取元素为军人的行纳入结果集中。
        if (count+1 < k){
            for (int i = 0; i < row; i++){
                if (mat[i][col-1]==1 && count+1 < k) ans[++count] = i;
            }
        }
        return ans;
    }
}
