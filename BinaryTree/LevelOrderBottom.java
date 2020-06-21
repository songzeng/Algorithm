package cn.maxzeng.algorithm.BinaryTree;

import java.util.*;

/**
 * @ClassName LevelOrderBottom
 * @Description 二叉树的层次遍历 II https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * @Author max.zeng
 * @Date 2020/6/17 0:01
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode tmp = queue.remove();
                if(tmp.left != null) queue.offer(tmp.left);
                if(tmp.right != null) queue.offer(tmp.right);
                tmpList.add(tmp.val);
            }
            stack.push(tmpList);
        }
        for(int i = stack.size(); i > 0; i--) {
            list.add(stack.pop());
        }
        return list;
    }
}
