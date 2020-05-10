package cn.maxzeng.algorithm.linked;

/**
 * @ClassName IsPalindrome
 * @Description 回文链表
 * @Author max.zeng
 * @Date 2020/5/5 10:35
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return  false;
        ListNode tmp = head;
        //先获取长度
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        ListNode tmp2 = head;
        //判断长度是奇数还是偶数
        int half = i%2 == 0 ? i/2 : (i+1)/2;
        while (half > 0) {
            tmp2 = tmp2.next;
            half--;
        }
        //反转剩下的一半链表
        ListNode prev = null;
        while (tmp2 != null) {
            ListNode temp = tmp2.next;
            tmp2.next = prev;
            prev = tmp2;
            tmp2 = temp;
        }
        while (tmp2 != null) {
            if(tmp2.val != head.val) {
                return  false;
            }
            tmp2 = tmp2.next;
            head = head.next;
        }

        return  true;
    }
}
