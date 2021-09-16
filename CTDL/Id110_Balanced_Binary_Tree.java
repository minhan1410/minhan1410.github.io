public class Id110_Balanced_Binary_Tree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(a.isBalanced(a));

        a = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        System.out.println(a.isBalanced(a));

        a = new TreeNode();
        System.out.println(a.isBalanced(null));
    }
}
