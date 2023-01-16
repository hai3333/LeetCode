package 链表;

import org.junit.Test;

import java.util.Stack;

/*
 * LeetCode 反转链表
 *
 * */
public class test3 {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        //把链表节点全部摘掉放到栈中
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode dummy = node;
        //栈中的结点全部出栈，然后重新连成一个新的链表
        while (!stack.isEmpty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next = null;
        return dummy;

    }

    public ListNode reverseList2(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode a = stack.pop();
        /*while(!stack.empty()){


        }*/
        System.out.println(stack);
        return head;

    }

    public ListNode reverseList3(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        if(head==null){
            return null;
        }
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        //开始出栈并且保存为listNode
        ListNode newNode = new ListNode();
        newNode=stack.pop();
        ListNode result=newNode;
        ListNode temp = new ListNode();
        while (!stack.empty()) {
            temp = stack.pop();
            newNode.next=temp;
            newNode=newNode.next;
        }
        newNode.next=null;

        return result;
    }


    @Test
    public void t() {
        ListNode head = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(3);
        ListNode root3 = new ListNode(4);
        head.next = root1;
        root1.next = root2;
        root2.next = root3;

        System.out.println(reverseList3(head));


    }
    @Test
    public void t2(){
        ListNode listNode=new ListNode();
        System.out.println(reverseList3(listNode));
    }

}
