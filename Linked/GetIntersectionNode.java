package cn.maxzeng.algorithm.Linked;

/**
 * @ClassName GetIntersectionNode
 * @Description  链表相交
 * @Author max.zeng
 * @Date 2020/5/7 23:01
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
        //得到一个链表和另一个对比多出的长度部分
        while (tempA != null && tempB != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        //得到多出的长度
        ListNode linkedLength = tempA == null ? tempB : tempA;
        //判断是谁更长
        ListNode linkedLonger = tempA == null ? headB : headA;
        //判断是谁更短
        ListNode linkedShort = tempA == null ? headA : headB;
        while(linkedLength != null) {
            linkedLength = linkedLength.next;
            linkedLonger = linkedLonger.next;
        }
        //现在两个一样长了
        while (linkedLonger != null) {
            if(linkedLonger == linkedShort) {
                return linkedShort;
            }
            linkedShort = linkedShort.next;
            linkedLonger = linkedLonger.next;
        }
        return null;
    }
}
