package 树和图;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-11-30 16:22
 * @other
 */
public class Test {
    public static void main(String[] args) {
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
//        connect connect1=new connect();
//        List<Integer> list = inorderTraversal(root);
//        connect1.connect(root);
//        System.out.println(list);
        Node rootA = new Node(1);
        Node rootB = new Node(2);
        Node rootC = new Node(3);
        Node rootD = new Node(4);
        Node rootE = new Node(5);
        Node rootF = new Node(6);
        Node rootG = new Node(7);
        rootA.left = rootB;
        rootA.right = rootC;
        rootA.left.left = rootD;
        rootA.left.right = rootE;
        rootA.right.left = rootF;
        rootA.right.right = rootG;
        connect connect1=new connect();
        Node connect = connect1.connect(rootA);

        System.out.println(connect);


    }
}
