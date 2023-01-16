package 链表;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-29 13:20
 * @other
 */


import org.junit.Test;

/**
 * 给定单链表的头节点 head ，将所有索引为奇数的节点和索引为偶数的节点分别组合在一起，然后返回重新排序的列表。
 * <p>
 * 第一个节点的索引被认为是 奇数 ， 第二个节点的索引为 偶数 ，以此类推。
 * <p>
 * 请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions-medium/xvdwtj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class oddEventList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode dummy = head;
        //新建两个链表 分别保存技术节点和偶数节点
        ListNode event = new ListNode(0);
        ListNode dummy1 = event;
        ListNode add = new ListNode(0);
        ListNode dummy2 = add;
        int count = 0;
        while (dummy != null) {
            if (count % 2 != 0) {
                dummy2.next = new ListNode(dummy.val);
               dummy2 = dummy2.next;
            } else {
                dummy1.next = new ListNode(dummy.val);
               dummy1 = dummy1.next;
            }
            dummy = dummy.next;
            count++;

        }
        dummy1.next=add.next;
        return event.next;



        //判断首位 进行拼接
//        if (head.val == event.next.val) {
//            //说明头节点是偶数
//            dummy1.next = add.next;
//            return event.next;
//        } else {
//            dummy2.next = event.next;
//            return add.next;
//        }


    }
    @Test
    public  void  test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        ListNode listNode1 = oddEvenList(listNode);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }

    }
}
