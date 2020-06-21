package cn.maxzeng.algorithm.BinaryTree;

/**
 * @ClassName SortedArrayToBST
 * @Description 最小高度树 https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 * @Author max.zeng
 * @Date 2020/6/18 0:00
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    /**
     * 二分法+递归
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode helper(int[] nums, int left, int right) {
        if(left == right) {
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid);
        
        node.right = helper(nums, mid+1, right);
        return node;
    }
}
