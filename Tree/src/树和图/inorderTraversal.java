package 树和图;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-30 13:33
 * @other
 */
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        qx2(root, list);
        return list;


    }

    public void qx(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        qx(root.left, list);
        list.add(root.val);
        qx(root.right, list);
    }

    //非递归遍历
    public void qx2(TreeNode root, List<Integer> list) {
        //用栈来保存节点  不停的往左子树走 并且保存在栈中 左子树为空 就输出栈里面最后一个子树 并且指向该子树的右节点
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            while (!stack.empty() || root != null) {
                //不停的保存左子树 直到左子树为空
                if (root != null) {
                    stack.add(root);
                    root = root.left;
                } else {
                    //左子树为空的话  弹出栈里面的子树 输出 并且指向该子树的右子树
                    root = stack.pop();
                    list.add(root.val);
                    root = root.right;
                }
            }
        }


    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(6);
        TreeNode root6 = new TreeNode(7);
        root.left = root1;
        root.right = root2;
        root.left.left = root3;
        root.left.right = root4;
        root.right.left = root5;
        root.right.right = root6;
        List<Integer> list = inorderTraversal(root);
        System.out.println(list);
    }

}
