import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test2 {
    /**
     * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
     * <p>
     * 有效 二叉搜索树定义如下：
     * <p>
     * 节点的左子树只包含 小于 当前节点的数。
     * 节点的右子树只包含 大于 当前节点的数。
     * 所有左子树和右子树自身必须也是二叉搜索树。
     * <p>
     * <p>
     * <p>
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.empty() || root!=null) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        for (int i = 0; i <list.size()-1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(5);
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4=new TreeNode(0);
        TreeNode root5=new TreeNode(0);
        TreeNode root6=new TreeNode(3);
        TreeNode root7=new TreeNode(6);
        root.right = root3;
        root.left = root2;
        root2.left=root4;
        root2.right=root5;
        root3.left=root6;
        root3.right=root7;
        System.out.println(isValidBST(root));
    }



}
