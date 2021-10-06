public class Id145_Binary_Tree_Postorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(tree.postorderTraversal(tree));

        tree = new TreeNode(3,null,new TreeNode(1,new TreeNode(2),null));
        System.out.println(tree.postorderTraversal(tree));

    }
}
