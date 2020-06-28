package cn.maxzeng.algorithm.Linked;

/**
 * @ClassName RemoveDuplicateNodes
 * @Description 移除所有重复节点
 * @Author max.zeng
 * @Date 2020/5/6 23:29
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = new ListNode(-1);
        temp.next = head;

        while (head != null) {
            ListNode prev = head;
            ListNode tempLink = prev.next;
            ListNode prevTemp = prev;
            while (tempLink != null) {
                if(head.val == tempLink.val) {
                    prevTemp.next = tempLink.next;
                } else {
                    prevTemp = prevTemp.next;
                }
                tempLink = tempLink.next;
            }
            head.next = prev.next;
            head = head.next;
        }
        return temp.next;
    }
}
