public class Id101_Symmetric_Tree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(a.isSymmetric(a)); //true

        a = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        System.out.println(a.isSymmetric(a)); //true

    }
}
