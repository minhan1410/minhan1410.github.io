package Tree;

public class MyBinarySearchTree {
    public TreeNode bRoot;

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else { // value < temp.value
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
        return root;
    }

    public TreeNode removeNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // B1: Tìm node cần xoá
        if (key < root.value) {// Đi về phía bên trái
            root.left = removeNode(root.left, key);
        } else if (key > root.value) {// Đi về phía bên phải
            root.right = removeNode(root.right, key);
        } else { // key = root.value, xác định được node muốn xoá
                 // TH 1: deleteNode là node lá
            if (root.left == null && root.right == null) {
                return null;
            }

            // TH2: deleteNode có 1 node con
            if (root.left != null && root.right == null) {
                return root.left;
            }
            if (root.left == null && root.right != null) {
                return root.right;
            }

            // TH3: Tồn tại 2 node con
            TreeNode leftNode = findLeftNode(root.right);
            root.value = leftNode.value;
            root.right = removeNode(root.right, leftNode.value);
        }
        return root;
    }

    public TreeNode findLeftNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftNode = root;
        while (leftNode.left != null) {
            leftNode = leftNode.left;
        }
        return leftNode;
    }

    // Duyệt tiền thứ tự
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Duyệt gốc
        System.out.print(root.value + " \t");
        // Duyet bên trái
        preOrder(root.left);
        // Duyệt bên phải
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Duyệt bên trái
        inOrder(root.left);
        // Duyệt gốc
        System.out.print(root.value + "\t");
        // Duyệt bên phải
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Duyệt bên trái
        postOrder(root.left);
        // Duyệt bên phải
        postOrder(root.right);
        // Duyệt gốc
        System.out.print(root.value + "\t");
    }

    // --------------------------------------------BTVN---------------------------------------------------
    public boolean find(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.value > val) {
            return find(root.left, val);
        } else if (root.value == val) {
            return true;
        } else {
            return find(root.right, val);
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.value == val) {
            return root;
        }

        if (root.value > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
    // ---------------------------------------------------------------------------------------------------
}
