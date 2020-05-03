package cn.maxzeng.algorithm.linked;

/**
 * 删除中间节点
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
