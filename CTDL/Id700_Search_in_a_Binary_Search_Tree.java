public class Id700_Search_in_a_Binary_Search_Tree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        System.out.println(head.searchBST(head, 2));

        System.out.println(head.searchBST(head,5));
    }
}
