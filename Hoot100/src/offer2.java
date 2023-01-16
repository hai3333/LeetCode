import org.junit.Test;

public class offer2 {


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curry = dummy;
        int sum = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int result = l1Val + l2Val + sum;
            //计算个位保留的数字
            int sumSingle = result % 10;
            //计算进位要加的数字
            sum = result / 10;
            ListNode resultNode = new ListNode(sumSingle);
            curry.next = resultNode;
            curry = curry.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (sum == 1)
            curry.next = new ListNode(sum);
        return dummy.next;


    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        //新生成一个头节点为0的链表
        ListNode dummy = new ListNode(0);
        ListNode curry = dummy;
        //新建保存进位的数字
        int sigin = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            //单独位求和
            int sum = l1Val + l2Val + sigin;
            //判断进位值
            sigin = sum / 10;
            //该位上该保存的值
            curry.next = new ListNode(sum % 10);
            //当前位求和完成 计算下一位
            curry = curry.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        //当所有位数计算完 查看是不是还有进位
        if (sigin == 1) {
            curry.next = new ListNode(sigin);
        }
        return dummy.next;
    }

    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        int jw = 0;
        int sum = 0;
        int l1val = 0;
        int l2val = 0;
        while (l1 != null || l2 != null) {
            l1val = l1 == null ? 0 : l1.val;
            l2val = l2 == null ? 0 : l2.val;
            sum=l1val+l2val+jw;
            dummy.next = new ListNode(sum%10);
            dummy=dummy.next;
            jw = sum / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (jw != 0) {
            dummy.next = new ListNode(1);
        }

        return result.next;

    }

    @Test
    public void test(){
        ListNode listNode1=new ListNode(2);
        listNode1.next=new ListNode(4);
        listNode1.next.next=new ListNode(3);
        ListNode listNode2=new ListNode(5);
        listNode2.next=new ListNode(6);
        listNode2.next.next=new ListNode(4);
        ListNode listNode = addTwoNumbers3(listNode1, listNode2);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }


    }


}
