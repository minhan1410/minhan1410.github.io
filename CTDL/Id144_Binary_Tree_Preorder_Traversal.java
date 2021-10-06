public class Id144_Binary_Tree_Preorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(tree.preorderTraversal(tree));
    }
}
