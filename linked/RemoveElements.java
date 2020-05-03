package cn.maxzeng.algorithm.linked;

/**
 * 移除链表元素
 * @author max.zeng
 * @date 2020/05/01 23:01
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode first = pre;

        while (head != null) {
            if(head.val == val) {
                first.next = head.next;
            }
            first = first.next;
            head = head.next;
        }
        return pre.next;
    }
}
