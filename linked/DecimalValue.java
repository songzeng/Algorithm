package cn.maxzeng.algorithm.linked;

/**
 * 二进制链表转整数
 * @author max.zeng
 * @date 2020/05/01 20:39
 */
public class DecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        int total = 0;
        while (head != null) {
            if(head.val == 1) {

                total += Math.pow(2, i - 1);
            }
            head = head.next;
            i--;
        }
        return total;
    }
}
