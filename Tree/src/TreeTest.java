import org.junit.Test;

import java.util.Stack;

public class TreeTest {

    //递归遍历
    public void dgq(TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }

        System.out.print(treeNode.val + " ");
        dgq(treeNode.left);
        dgq(treeNode.right);


    }

    public void dgz(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }


        dgz(treeNode.left);
        System.out.print(treeNode.val + " ");
        dgz(treeNode.right);


    }

    public void dgh(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        dgh(treeNode.left);
        dgh(treeNode.right);
        System.out.print(treeNode.val + " ");


    }

    /*
     * 非递归遍历
     * */
    public void q(TreeNode treeNode) {
        System.out.println("非递归前序遍历");
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (treeNode != null) {
            stack.push(treeNode);
            while (!stack.empty()) {
                treeNode = stack.pop();
                System.out.print(treeNode.val + "  ");
                if (treeNode.right != null) {
                    stack.push(treeNode.right);
                }
                if (treeNode.left != null) {
                    stack.push(treeNode.left);
                }

            }

        }
        System.out.println();
    }

    public void z(TreeNode treeNode) {
        System.out.println("非递归中序遍历");
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (treeNode != null) {
            while (!stack.empty() || treeNode != null) {
                if(treeNode!=null){
                    stack.push(treeNode);
                    treeNode=treeNode.left;
                }else{
                    treeNode=stack.pop();
                    System.out.print(treeNode.val+" ");
                    treeNode=treeNode.right;
                }

            }

        }
        System.out.println();

    }

    public void h(TreeNode treeNode) {
        System.out.println("非递归后续遍历");
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stackOutput = new Stack<TreeNode>();
        if (treeNode != null) {
            stack.push(treeNode);
            while (!stack.empty()) {
                treeNode = stack.pop();
                stackOutput.push(treeNode);
                if (treeNode.left != null) {
                    stack.push(treeNode.left);
                }
                if (treeNode.right != null) {
                    stack.push(treeNode.right);
                }
            }
            //outputStack输出
            while (!stackOutput.empty()) {
                TreeNode node = stackOutput.pop();
                System.out.print(node.val + "  ");
            }

        }
        System.out.println();

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
        System.out.println("递归前序");
        dgq(root);
        System.out.println();
        System.out.println("递归中序");
        dgz(root);
        System.out.println();
        System.out.println("递归后序");
        dgh(root);
        System.out.println();
        q(root);
        h(root);
        z(root);


    }

}
