package cn.maxzeng.algorithm.BinaryTree;

/**
 * @ClassName IsBalanced
 * @Description 平衡二叉树 https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 * @Author max.zeng
 * @Date 2020/6/13 12:03
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    /**
     * 后序遍历+剪枝 （从底至顶） 遇到不符合条件直接一直往上抛
     * @param root
     * @return
     */
    private int recur(TreeNode root) {
        if(root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left-right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
