package 树和图;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-30 16:56
 * @other
 */
//二叉搜索树 也就是左子树小于根节点小于右子树
 //说白了就是中序遍历的结果是从小到大的排序
public class kthSmallest {
    public int kthSmallest(TreeNode root, int k) {
            List list=new ArrayList();
            //中序遍历得到结果
            zx(root,list);
            return (int) list.get(k-1);
    }
    private  void zx(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        zx(root.left,list);
        list.add(root.val);
        zx(root.right,list);
    }

}
