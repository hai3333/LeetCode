import org.junit.Test;

import java.util.Scanner;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-10-05 15:34
 * @other
 */
public class item2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        ListNode cur = null;
        ListNode next = null;
        ListNode pre = new ListNode(0);
        pre.next = head;
        if (head == null || m == n) {
            return head;
        }
        //左边
        //找到需要反转的部分 生成新的list
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        //找到需要反转的部分
        ListNode right = pre;
        for (int i = 0; i < n - m + 1; i++) {
            right = right.next;
        }
        // 截取子链表
        ListNode leftNode = pre;
        ListNode curry = right.next;
        //切断链接
        pre.next = null;
        right.next = null;
        //反转
        reverseLinkedList(leftNode);
        //接回来原来的链表
        pre.next = right;
        leftNode.next = cur;
        return pre;


    }

    private void reverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //Cur_next 指向cur节点的下一个节点
            ListNode Cur_next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = Cur_next;
        }
    }

    public ListNode reverseBetween2(ListNode head, int m, int n) {

        //先找到需要反转的链表
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode pre = listNode;
        //找到断开前的节点位置
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        //从这个节点开始 找到需要反转的链表
        ListNode right = pre;
        for (int i = 0; i < n - m + 1; i++) {
            right = right.next;
        }
        //截取需要反转的链表
        ListNode left = pre.next;
        //需要反转的节点之后的节点
        ListNode cur = right.next;
        //切断链接
        pre.next = null;
        right.next = null;

        //反转
        reverseLinkedList(left);
        //接回来
        pre.next = right;
        left.next = cur;
        return listNode.next;

    }
    public  ListNode reverseBetween3(ListNode head, int m, int n){

        ListNode listNode=new ListNode(0);
        listNode.next=head;
        ListNode per=listNode;
        //开始遍历到需要断开的节点的前一个位置   后面断开的时候用
        for(int i=0;i<m-1;i++){
            per = per.next;
        }
        //指针走到断开节点的最后一个
        ListNode right=per;
        for(int i=0;i<n-m+1;i++){
            right=right.next;
        }
        //生成新的节点
        ListNode left=per.next;  // 开始反转的地方
        ListNode cur=right.next; //反转结束的地方

        //断开
        per.next=null;//反转前部分
        right.next=null;//反转最后一个
        //反转
        reverseLinkedList(left);
        //重新拼接
        per.next=right;
        left.next=cur;
        return listNode.next;




        //

    }
//输入两个递增的链表，单个链表的长度为n，合并这两个链表并使新链表中的节点仍然是递增排序的。
//数据范围： 0 \le n \le 10000≤n≤1000，-1000 \le 节点值 \le 1000−1000≤节点值≤1000
//要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
//迭代
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node1=list1;
        ListNode node2=list2;
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        while(list1!=null & list2!=null){
                if(list1.val<=list2.val){
                    result.next=list1;
                    list1=list1.next;
                }else{
                    result.next=list2;
                    list2=list2.next;
                }
                result=result.next;
        }
        if(list1!=null){
            result.next=list1;
        }
        if(list2!=null){
            result.next=list2;
        }
        return dummy.next;
    }
//递归
public ListNode Merge2(ListNode list1,ListNode list2){
        ListNode root;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1.val< list2.val){
            root=list1;
            root.next=Merge2(list1.next,list2);
        }else{
            root=list2;
            root.next=Merge2(list1,list2.next);
        }
        return root;

}

    @Test
    public void test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        int m=2;
        int n=4;
        ListNode listNode1 = reverseBetween3(listNode, 2, 4);
         while (listNode1!=null){
             System.out.println(listNode1.val);
             listNode1=listNode1.next;
         }
    }
    @Test
    public void test2(){
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        System.out.println(next);
    }

    @Test
    public void test3(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(3);
        listNode.next.next=new ListNode(5);

        ListNode listNode2=new ListNode(2);
        listNode2.next=new ListNode(4);
        listNode2.next.next=new ListNode(6);
        Merge2(listNode,listNode2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        System.out.println(next);
    }



}
