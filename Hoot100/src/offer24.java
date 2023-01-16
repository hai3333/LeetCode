import org.junit.Test;

public class offer24 {
//    定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode newHead = null, temp = null, dummy = head;

        while (dummy.next != null) {

        }
        return head;


    }


    @Test
    public void test() {
        ListNode listNode = new ListNode(9);
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;


    }
}
