package 链表;

import org.junit.Test;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class test24 {
    public ListNode swapPairs(ListNode head) {
        // base case 退出提交
        if (head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = swapPairs(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1=temp.next;
            ListNode node2=temp.next.next;
            temp.next=node2;
            node1.next=node2.next;
            node2.next=node1;
            temp=node1;

        }
        return dummy.next;
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
        System.out.println(swapPairs(head));
        //System.out.println(swapPairs2(head));
        //System.out.println(swapPairs3(head));
    }
}
