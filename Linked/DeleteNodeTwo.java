package cn.maxzeng.algorithm.Linked;

/**
 * @ClassName DeleteNodeTwo
 * @Description 删除链表指定节点
 * @Author max.zeng
 * @Date 2020/5/5 10:33
 */
public class DeleteNodeTwo {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prev = temp;
        while (head != null) {
            if(head.val == val) {
                prev.next = head.next;
                break;
            }
            prev = prev.next;
            head = head.next;
        }
        return temp.next;
    }
}
