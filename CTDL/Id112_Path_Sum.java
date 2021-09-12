public class Id112_Path_Sum {
    public static void main(String[] args) {
        TreeNode case1 = new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));

        System.out.println(case1.hasPathSum(case1, 22));
    }
}
