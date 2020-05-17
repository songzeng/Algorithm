package cn.maxzeng.algorithm.linked;

/**
 * @ClassName Node
 * @Description Definition for a Node.
 * @Author max.zeng
 * @Date 2020/5/12 22:53
 */
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }

}
