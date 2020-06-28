package cn.maxzeng.algorithm.Linked;

import java.util.HashMap;

/**
 * @ClassName CopyRandomList
 * @Description 复制带随机指针的链表
 * @Author max.zeng
 * @Date 2020/5/12 22:46
 */
public class CopyRandomList {
    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

    /**
     * 递归解法-使用HashMap保存每个节点
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node node = new Node(head.val, null, null);
        this.visitedHash.put(head, node);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);
        return node;
    }

    public Node copyRandomList2(Node head) {
        if(head == null) return null;

        Node node = new Node(-1, null, null);
        node.next = head;
        Node prev = node;

        while (prev == null) {

        }
        return node;
    }

}
