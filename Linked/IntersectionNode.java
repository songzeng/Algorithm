package cn.maxzeng.algorithm.Linked;

/**
 * 相交链表 - 只要走一遍对方走过的路 对的人一定会相逢
 * @author max.zeng
 * @date 2020/05/01 11:39
 */
public class IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
