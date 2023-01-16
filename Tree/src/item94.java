import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/*
*
* 中序遍历
*
* */
public class item94 {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res=new ArrayList<Integer>();
            inorder(root,res);
            return res;

        }



        public void inorder(TreeNode root,List<Integer> res){
            if (root==null){
                return;
            }
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);

        }

        /*  方法二  */
    public void inorder2(TreeNode treeNode){

    }



    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(7);
        root.right = root3;
        root.left = root2;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        System.out.println(inorderTraversal(root));

    }




}
