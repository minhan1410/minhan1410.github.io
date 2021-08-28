package Tree;

public class MyMain {
    public static void main(String[] args) {
        // MyBinaryTree bTree = new MyBinaryTree();
        // bTree.init();

        // System.out.println("Done");
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n9 = new TreeNode(9);
        TreeNode n1 = new TreeNode(1);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n10 = new TreeNode(10);
        TreeNode n0 = new TreeNode(0);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);

        n6.left = n2;
        n6.right = n9;
        n2.left = n1;
        n2.right = n4;
        n1.left = n0;
        n4.left = n3;
        n4.right = n5;
        n9.left = n7;
        n9.right = n10;

        MyBinarySearchTree mSearchTree = new MyBinarySearchTree();
        // mSearchTree.bRoot = n6;
        // System.out.println("DONE");

        // mSearchTree.insert(n6, 8);
        // System.out.println("Success!");

        // mSearchTree.removeNode(n6, 2);
        // System.out.println("Success");
        // mSearchTree.preOrder(n6);
        // System.out.println();

        // mSearchTree.inOrder(n6);
        // System.out.println();

        // mSearchTree.postOrder(n6);

        mSearchTree.preOrder(n6);
        System.out.println();
        System.out.println(mSearchTree.find(n6, 6) + " - 6");
        System.out.println(mSearchTree.find(n6, 2) + " - 2");
        System.out.println(mSearchTree.find(n6, 1) + " - 1");
        System.out.println(mSearchTree.find(n6, 0) + " - 0");
        System.out.println(mSearchTree.find(n6, 4) + " - 4");
        System.out.println(mSearchTree.find(n6, 3) + " - 3");
        System.out.println(mSearchTree.find(n6, 5) + " - 5");
        System.out.println(mSearchTree.find(n6, 9) + " - 9");
        System.out.println(mSearchTree.find(n6, 7) + " - 7");
        System.out.println(mSearchTree.find(n6, 10) + " - 10");
        System.out.println(mSearchTree.find(n6, 30) + " - 30");
        System.out.println(mSearchTree.find(n6, 29) + " - 29");
        System.out.println(mSearchTree.find(n6, 99) + " - 99");
        System.out.println(mSearchTree.find(n6, 100) + " - 100");

        TreeNode tree = new TreeNode(6);
        System.out.println(mSearchTree.find(tree, 6) + " - 6");
        System.out.println(mSearchTree.find(tree, 20) + " - 20");

        TreeNode tree1 = new TreeNode(-1);
        System.out.println(mSearchTree.find(tree1, -1) + " - (-1)");
        System.out.println(mSearchTree.find(tree, 20) + " - 20");
    }
}
