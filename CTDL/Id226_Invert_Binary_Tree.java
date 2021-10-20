public class Id226_Invert_Binary_Tree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(8)));
        tree.invertTree(tree);
        System.out.println(tree);
    }
}
