import jdk.jfr.StackTrace;
import org.junit.Test;

import java.lang.annotation.Target;

public class test1 {

    /**
     * 给定一个二叉树，找出其最大深度。
     * <p>
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * <p>
     * 说明: 叶子节点是指没有子节点的节点。
     * <p>
     * 示例：
     * 给定二叉树 [3,9,20,null,null,15,7]，
     * <p>
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnd69e/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    /*
    * 递归
    * */

        public int max(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=max(root.left);
            int right=max(root.right);
            return (left>=right? left:right)+1;
        }
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + (left >= right ? left : right);
    }

    /*
    * 循环
    *
    * */




        @Test
    public void test(){
            TreeNode root=new TreeNode(1);
            TreeNode root2=new TreeNode(2);
            TreeNode root3=new TreeNode(3);
            TreeNode root4=new TreeNode(4);
            TreeNode root5=new TreeNode(5);
            TreeNode root6=new TreeNode(6);
            TreeNode root7=new TreeNode(7);
            root.right=root3;
            root.left=root2;
            root2.left=root4;
            root2.right=root5;
            root3.left=root6;
            root3.right=root7;
            max(root);
            //maxDepth(root);


        }




}

