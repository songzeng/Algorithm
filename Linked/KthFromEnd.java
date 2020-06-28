package cn.maxzeng.algorithm.Linked;

/**
 * 链表中倒数第k个节点
 * @author max.zeng
 * @date 2020/05/02 8:51
 */
public class KthFromEnd {
    /**
     * 两次循环
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }

        ListNode ret = new ListNode(-1);
        while (head != null) {
            if(i-1 > k) {
                System.out.println(111);
                ret.next = head;
            }
            head = head.next;
            i--;
        }
        return ret;
    }

    /**
     * 快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode firstList = head;
        int i = k;
        while (i > 0) {
            firstList = firstList.next;
            i--;
        }
        while (true) {
            if(firstList == null) {
                return head;
            }
            head = head.next;
            firstList = firstList.next;
        }
    }
}
