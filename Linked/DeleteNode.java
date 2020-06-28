package cn.maxzeng.algorithm.Linked;

/**
 * 删除中间节点
 * @author max.zeng
 * @date 2020/05/01 11:39
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
