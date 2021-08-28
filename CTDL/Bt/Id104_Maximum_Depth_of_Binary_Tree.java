public class Id104_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(root.maxDepth(root));
    }
}
