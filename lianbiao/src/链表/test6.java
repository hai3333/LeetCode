package 链表;


/*给你一个链表的头节点 head ，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。

如果链表中存在环 ，则返回 true 。 否则，返回 false

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnwzei/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
public class test6 {
    public boolean hasCycle(ListNode head) {
        int i = 0;
        if (head == null) {
            return false;
        }
        while (i < 1000) {
            head = head.next;
            i++;
            if (head == null) {
                return false;
            }
        }
        return true;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode l1=head;
        ListNode l2=head;
        while (l2!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next.next;
            if(l1==l2){
                return true;
            }
        }
        return false;


    }

}

