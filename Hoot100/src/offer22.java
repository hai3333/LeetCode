/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class offer22 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy = head;
        ListNode left = head;
        ListNode right = head.next;
        while (k != 0 && right != null) {
            right = right.next;
            k--;
        }
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        return left.next;


    }

//    offer24 反转链表

    public ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode dummy = head;
        ListNode temp = null;
        while (dummy != null) {
            temp = dummy.next;
            dummy.next = left;
            left = dummy;
            dummy = temp;
        }
        return left;
    }


    //offer50  输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode newListNode = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                newListNode.next= l1;
                l1 = l1.next;
            } else {
                newListNode.next= l2;
                l2 = l2.next;
            }
            newListNode = newListNode.next;
        }
        if (l1 != null) {
            newListNode.next = l1;

        }
        if (l2 != null) {
            newListNode.next = l2;

        }
        return dummy.next;
    }


}



