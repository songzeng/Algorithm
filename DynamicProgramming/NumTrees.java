package cn.maxzeng.algorithm.DynamicProgramming;

/**
 * @ClassName NumTrees
 * @Description 不同的二叉搜索树 https://leetcode-cn.com/problems/unique-binary-search-trees/
 * @Author max.zeng
 * @Date 2020/6/28 22:40
 */
public class NumTrees {

    /**
     * 卡特兰数
     * 假设n个节点存在二叉排序树的个数是G(n)，令f(i)为以i为根的二叉搜索树的个数，则
     * G(n)=f(1)+f(2)+f(3)+f(4)+...+f(n)
     * 当i为根节点时，其左子树节点个数为i-1个，右子树节点为n-i，则
     * f(i)=G(i−1)∗G(n−i)
     * G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++)
            for(int j = 1; j < i + 1; j++)
                dp[i] += dp[j-1] * dp[i-j];

        return dp[n];
    }
}
