package cn.maxzeng.algorithm.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeafSimilar
 * @Description TODO
 * @Author max.zeng
 * @Date 2020/6/21 18:13
 */
public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if(root.left == null && root.right == null) {

            list.add(root.val);
        } else {
            if(root.left != null) {
                dfs(root.left, list);
            }
            if(root.right != null) {
                dfs(root.right, list);
            }
        }
    }

}
