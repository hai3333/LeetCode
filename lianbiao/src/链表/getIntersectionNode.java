package 链表;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-29 14:28
 * @other
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet set=new HashSet();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(!set.add(headB)){
                return headB;
            }else {
                headB=headB.next;
            }

        }
        return null;
    }
    @Test
    public  void test(){
        ListNode listNode=new ListNode(4);
        listNode.next=new ListNode(1);
        listNode.next.next=new ListNode(8);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        ListNode listNode1=new ListNode(8);
        System.out.println(getIntersectionNode(listNode, listNode1));
    }

}
