package 链表;


import org.junit.Test;

public class item61 {
    /**
     * <h1>旋转链表</h1>
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     */
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=head;
        ListNode temp=dummy;
        ListNode first=temp;
        while (temp.next!=null){

            if(temp.next.next==null){
                temp.next.next=first;
                temp.next=null;
            }else {
                temp=temp.next;
            }

        }

        return first;
    }


    @Test
    public  void test(){
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(3);
        ListNode root3 = new ListNode(4);
        ListNode root4 = new ListNode(5);
        head.next = root1;
        root1.next = root2;
        root2.next = root3;
        root3.next=root4;
        System.out.println(rotateRight(head, 1));

    }
}
