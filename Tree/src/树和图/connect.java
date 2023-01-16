package 树和图;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-30 16:07
 * @other
 */
public class connect {

    public Node connect(Node root) {
        //先层序遍历
        List<List<Node>> list=new ArrayList();
        cx(root,0,list);
        //处理list中的root
        Node dummy=root;
        for(int i=0;i< list.size();i++){
            int j=0;
            while (j<list.get(i).size()-1){
                dummy=list.get(i).get(j);
                dummy.next=list.get(i).get(j+1);
                j++;
            }
        }
        return root;
    }
    //得到层序便利的结果
    private void cx(Node root, int depth, List<List<Node>> list){
        if(root==null)
            return;
        if(depth>=list.size())
            list.add(new ArrayList<>());
        list.get(depth).add(root);
        cx(root.left,depth+1,list);
        cx(root.right,depth+1,list);
    }
}
