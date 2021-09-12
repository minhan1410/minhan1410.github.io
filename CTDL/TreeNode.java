class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 0 ms 40.6 MB
        if (root == null) {
            return false;
        }

        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public int maxDepth(TreeNode root) {
        // 0 ms 38.7 MB
        if (root == null)
            return 0;

        if (root.right == null && root.left == null)
            return 1;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val ){
            return root;
        }

        if(root.val > val){
            return searchBST(root.left,val);
        } 
        return searchBST(root.right,val);
    }

    @Override
    public String toString() {
        return "TreeNode [val=" + val + "]";
    }
}