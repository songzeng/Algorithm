package cn.maxzeng.algorithm;

import cn.maxzeng.algorithm.Linked.*;
import cn.maxzeng.algorithm.String.RomanToInt;

public class Application {

    public static void main(String[] args) {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
//        listNodeOne.next = listNodeTwo;
//        DeleteNode deleteNodeOne = new DeleteNode();
//        deleteNodeOne.deleteNode(listNodeOne);
//        IntersectionNode intersectionNodeOne = new IntersectionNode();
//        intersectionNodeOne.getIntersectionNode(listNodeOne, listNodeTwo);

//        DecimalValue decimalValue = new DecimalValue();
//        System.out.println(decimalValue.getDecimalValue(listNodeOne));

//        KthFromEnd kthFromEnd = new KthFromEnd();
//        kthFromEnd.getKthFromEnd(listNodeOne, 1);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
//        ReverseList reverseList = new ReverseList();
//        System.out.println(reverseList.reverseList2(listNodeOne));

//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        System.out.println(addTwoNumbers.addTwoNumbers(listNode3, listNode4));

        RomanToInt romanToInt = new RomanToInt();
        romanToInt.romanToInt("MCMXCIV");

    }

}
