public class Id100_Same_Tree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode b = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(a.isSameTree(a, b));

        a = new TreeNode(1, new TreeNode(2), null);
        b = new TreeNode(1, null, new TreeNode(2));
        System.out.println(a.isSameTree(a, b));

        a = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        b = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(a.isSameTree(a, b));

    }
}
