package cn.maxzeng.algorithm.Linked;

/**
 * 反转链表
 * @author max.zeng
 * @date 2020/05/02 8:51
 */
public class ReverseList {
    /**
     * 迭代实现
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    /**
     * 递归实现
     * 递归实现反转有点难理解 可以参考这个讲解
     * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/dong-hua-yan-shi-duo-chong-jie-fa-206-fan-zhuan-li/
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        //这一步是递归到链表尾端，cur第一个弹出来的是5
        ListNode cur = reverseList2(head.next);
        //这一步是整个反转过程的关键，特别不好理解一开始；首先head是4，那head.next就是5，那head.next.next就是5的下一个，此时赋值给head，就是5->4！妙啊！！
        head.next.next = head;
        //这一步是为了防止链表循环， 需要把之前的连接先去掉 4->5这个去掉
        head.next = null;
        //cur就是反转后的首部了5
        return cur;
    }
}
