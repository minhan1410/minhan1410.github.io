public class Id94_Binary_Tree_Inorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(tree.inorderTraversal(tree));

        tree = new TreeNode();
        System.out.println(tree.inorderTraversal(tree));

        tree = new TreeNode(1);
        System.out.println(tree.inorderTraversal(tree));

        tree = new TreeNode(1,new TreeNode(2),null);
        System.out.println(tree.inorderTraversal(tree));

        tree = new TreeNode(1,null,new TreeNode(2));
        System.out.println(tree.inorderTraversal(tree));
    }
}
