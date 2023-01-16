package 链表;

import org.junit.Test;
/*
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 * */

public class test2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = Len(head);
        int del = len - n ;

        System.out.println(del);
        // System.out.println(del);
        if(n==0){
            return head;
        }
        for (int i = 0; i <del-1; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return head;
      /*  ListNode pre = head;
        int last = Len(head) - n;
        //如果last等于0表示删除的是头结点
        if (last == 0)
            return head.next;
        //这里首先要找到要删除链表的前一个结点
        for (int i = 0; i < last - 1; i++) {
            pre = pre.next;
        }
        //然后让前一个结点的next指向要删除节点的next
        pre.next = pre.next.next;
        return head;*/


    }

    public int Len(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    @Test
    public void lianbiao1() {
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(3);
        ListNode root3 = new ListNode(4);
        head.next = root1;
        root1.next = root2;
        root2.next = root3;
        int a = Len(head);
        System.out.println(a);
        //System.out.println(head);
        ListNode result = removeNthFromEnd(head, 2);
        System.out.println(result);


    }


}


