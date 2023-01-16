import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test3 {


    /**
     *
     * <h1>给你一个二叉树的根节点 root ， 检查它是否轴对称。</h1>
     */


    /**
     * <h1>思路一 </h1>中序遍历的结果存储在列表中 完了用双指针前后判断 不相等返回false<br>
     * <p><b><font color=red>这个想法存在缺陷 会存在遍历结果相同但是排列不同的树</font> </b></p>
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.empty() || root != null) {
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
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * <h1>思路2</h1>
     * <b>通过递归的方式解决 判断左右子树是否相等也就是对称</b>
     */


    public boolean isSymmetric2(TreeNode root) {
        if (root == null)
            return true;
        return isSymHelp(root.left, root.right);

    }

    public boolean isSymHelp(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val != right.val)
            return false;
        return isSymHelp(left.left, right.right) && isSymHelp(left.right, right.left);

    }


    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(3);
        root.right = root3;
        root.left = root2;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        System.out.println(isSymmetric(root));
        //maxDepth(root);


    }


}
