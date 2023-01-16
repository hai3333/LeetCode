package 链表;

import org.junit.Test;

public class item83 {
    /*
    * 删除链表重复内容
    *
    * */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=head;
        while (head!=null){
            if(head.val==head.next.val && head.next!=null ){
                head.next=head.next.next;
            }
            head=head.next;
        }

        return dummy;
    }

    @Test
    public void t() {
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(1);
        ListNode root2 = new ListNode(2);
        ListNode root3 = new ListNode(3);
        ListNode root4 = new ListNode(3);
        head.next = root1;
        root1.next = root2;
        root2.next = root3;
        root3.next=root4;
        System.out.println(deleteDuplicates(head));

    }

}
