package 链表;

import org.junit.Test;

/*
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * */
public class test4 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode re = new ListNode();
        ListNode result = re;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;

            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        /*if (l1 == null) {
            result.next = l2;
        } else {
            result.next = l1;
        }*/
        result.next = l1 == null ? l2 : l1;
        return re.next;
    }


    @Test
    public void t() {
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(4);
        head.next = root1;
        root1.next = root2;

        ListNode head2 = new ListNode(1);
        ListNode root11 = new ListNode(3);
        ListNode root22 = new ListNode(4);
        head2.next = root11;
        root11.next = root22;

        System.out.println(mergeTwoLists(head, head2));


    }
}
