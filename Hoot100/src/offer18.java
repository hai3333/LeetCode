import org.junit.Test;

public class offer18 {

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 * */

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

 public int lengthListNode(ListNode head){
         int len=0;
         ListNode dummy=head;
         while (dummy!=null){
             dummy=dummy.next;
             len++;
         }
         return len;
 }


 /** public ListNode deleteNode(ListNode head, int val) {
  if(head == null) return head;
  ListNode cur = head;
  ListNode pre = null;
  if(cur.val == val) return head.next;
  while(cur.val != val) {
  pre = cur;
  cur = cur.next;
  }
  pre.next = pre.next.next;
  return head;*/

    public ListNode deleteNode(ListNode head, int val) {
       ListNode result=head;
       ListNode dummy=null;
       if(head==null){
           return head;
       }
       if(result.val==val){
           return head.next;
       }
       while (result.val!=val){
           dummy=result;
           result=result.next;
       }
       dummy.next=dummy.next.next;

       return head;

    }
    @Test
    public void test(){
         ListNode listNode=new ListNode(9);
         ListNode listNode1=new ListNode(6);
         ListNode listNode2 =new ListNode(2);
         ListNode listNode3=new ListNode(1);
         listNode.next=listNode1;
         listNode1.next=listNode2;
        System.out.println(lengthListNode(listNode));
        deleteNode(listNode,6);
        System.out.println(listNode.next);
    }



}
