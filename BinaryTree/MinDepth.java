package cn.maxzeng.algorithm.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LevelOrder
 * @Description 二叉树的最小深度 https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @Author max.zeng
 * @Date 2020/6/16 0:07
 */
public class MinDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 层序遍历 - 广度优先
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int n = 1, min = Integer.MAX_VALUE;
        while(queue.size() > 0) {
            for(int i = queue.size(); i > 0; i--) {
                TreeNode temp = queue.poll();
                if(temp.left != null) {
                    queue.offer(temp.left);
                }
                if(temp.right != null) {
                    queue.offer(temp.right);
                }
                if(temp.left == null && temp.right == null) {
                    if(min > n) {
                        min = n;
                    }
                }
            }
            n++;
        }
        return min;
    }
}
