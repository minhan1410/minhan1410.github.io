import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
        if (root == null || root.val == val) {
            return root;
        }

        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tree = root;
        while (tree != null || !stack.isEmpty()) {
            while (tree != null) {
                stack.push(tree);
                tree = tree.left;
            }
            tree = stack.pop();
            result.add(tree.val);
            tree = tree.right;
        }
        return result;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
//        1 ms	38.3 MB
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {
//        0 ms	39 MB
        return checkSymmetric(root.left, root.right);
    }

    public boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
//        0 ms	40.6 MB
        if (nums.length == 0) return null;
        return addArrayToTree(nums, 0, nums.length - 1);
    }

    public TreeNode addArrayToTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode tree = new TreeNode(nums[mid]);
        tree.left = addArrayToTree(nums, left, mid - 1);
        tree.right = addArrayToTree(nums, mid + 1, right);

        return tree;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int subTree = Math.abs(height(root.left) - height(root.right));

        if (subTree == 1 || subTree == 0) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = height(root.left);
        int r = height(root.right);

        return 1 + Math.max(l, r);
    }

    public int minDepth(TreeNode root) {
//        5 ms	59.8 MB
        if (root == null) return 0;
        if (root != null && root.left == null && root.right == null) return 1;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
//        0 ms	37.3 MB
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        preorder(root, result);
        return result;
    }
    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        postorder(root, result);
        return result;
    }
    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }

    @Override
    public String toString() {
        return "TreeNode [val=" + val + "]";
    }
}