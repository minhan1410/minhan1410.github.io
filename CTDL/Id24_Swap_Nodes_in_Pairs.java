public class Id24_Swap_Nodes_in_Pairs {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        System.out.println(ListNode.swapPairs(h1));

        ListNode h2 = new ListNode();
        System.out.println(h2);

        ListNode h3 = new ListNode(1);
        System.out.println(h3);

        ListNode h4 = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(ListNode.swapPairs(h4));
    }
}
