package 树和图;


/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-30 14:20
 * @other
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
 */
public class zigzagLevelOrder {
    //按层次做处理
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traverse2(root, 0, res);
        return res;
    }

    private void traverse(TreeNode root, int depth, List<List<Integer>> res) {
        if (root == null) return;
        if (depth >= res.size()) {
            res.add(new ArrayList<Integer>());
        }
        if (depth % 2 == 0) {
            res.get(depth).add(root.val);
        } else {
            res.get(depth).add(0, root.val);
        }
        traverse(root.left, depth + 1, res);
        traverse(root.right, depth + 1, res);
    }

    public void traverse2(TreeNode root, int depth, List<List<Integer>> list) {
        if (root == null)
            return;
        if (depth >=list.size())
            list.add(new ArrayList<>());
        //偶数层正常添加
        if (depth % 2 == 0) {
            list.get(depth).add(root.val);
        }else{
            list.get(depth).add(0, root.val);
        }
        traverse2(root.right,depth+1,list);
        traverse2(root.left,depth+1,list);


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
        System.out.println(zigzagLevelOrder(root));
//        System.out.println();
    }

}
