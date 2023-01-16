package 链表;

import org.junit.Test;

import java.util.Stack;

/*给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 *
 * */
public class test5 {

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp=head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.empty()) {
            ListNode l1 = head;
            ListNode l2 = stack.pop();
            if (l1.val != l2.val) {
                return false;
            }
            head=head.next;

        }
    return true;

    }

    @Test
    public void t() {
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(2);
        ListNode root3 = new ListNode(1);
        head.next = root1;
        root1.next = root2;
        root2.next = root3;
        System.out.println(isPalindrome(head));

    }

}
