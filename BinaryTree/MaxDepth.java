package cn.maxzeng.algorithm.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MaxDepth
 * @Description  N叉树的最大深度 https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * @Author max.zeng
 * @Date 2020/6/21 19:04
 */
public class MaxDepth {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        Integer num = 0, max = 0;
        List<Integer> numList = new ArrayList<>();
        dfs(root, num, numList);
        for(Integer i : numList) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

    private void dfs(Node root, Integer num, List<Integer> numList) {
        if(root != null) {
            if(root.children.isEmpty()) {
                num++;
                numList.add(num);
            } else {
                for(Node temp : root.children) {
                    dfs(temp, num+1, numList);
                }
            }
        }
    }
}

