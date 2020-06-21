package cn.maxzeng.algorithm.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName BinaryTreePaths
 * @Description 二叉树的所有路径 https://leetcode-cn.com/problems/binary-tree-paths/
 * @Author max.zeng
 * @Date 2020/6/20 23:19
 */
public class BinaryTreePaths {
    /**
     * 深度优先算法
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        construct_paths(root, "", paths);
        return paths;
    }

    public void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
        if(root != null) {
            path += Integer.toString(root.val);
            //判断是否是叶子节点
            if((root.left == null) && (root.right == null))
                paths.add(path);
            else
                path += "->";
            construct_paths(root.left, path, paths);
            construct_paths(root.right, path, paths);
        }
    }
}
