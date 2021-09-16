public class Id111_Minimum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(a.minDepth(a));

        a = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println(a.minDepth(a));
    }
}
