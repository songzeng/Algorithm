package cn.maxzeng.algorithm.Linked;

/**
 * @ClassName AddTwoNumbers
 * @Description 两数相加
 * @Author max.zeng
 * @Date 2020/5/10 10:46
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int ad = 0;
        ListNode res = new ListNode(-1);
        ListNode prev = res;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            sum = l1Val + l2Val + ad;
            if(sum >= 10) {
                sum = sum - 10;
                ad = 1;
            } else {
                ad = 0;
            }
            ListNode re = new ListNode(sum);
            prev.next = re;
            prev = prev.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(ad == 1) {
            prev.next = new ListNode(1);
        }
        return res.next;
    }

    /**
     * 递归做加法 逢十进一
     * @param l1
     * @param l2
     * @return
     */
    public ListNode solveBase(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        int sum = l1.val + l2.val;
        ListNode sumNode = solveBase(l1.next, l2.next);
        ListNode re = new ListNode(sum);
        if(sumNode == null) {
            return re;
        }
        int sonSum = sumNode.val;
        if(sum >= 10) {
            sumNode.val = sumNode.val + 1;
            re.val = sum - 10;
        }
        sumNode.next = re;
        return sumNode;
    }
}
