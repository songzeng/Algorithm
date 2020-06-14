package cn.maxzeng.algorithm.BinaryTree;

/**
 * @ClassName IsBalanced2
 * @Description 检查平衡性 https://leetcode-cn.com/problems/check-balance-lcci/
 * @Author max.zeng
 * @Date 2020/6/14 13:21
 */
public class IsBalanced2 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int re = recur(root);
        if(re == -1) {
            return false;
        }
        return true;
    }

    /**
     * 后续+剪枝
     * @param root
     * @return
     */
    public int recur(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
