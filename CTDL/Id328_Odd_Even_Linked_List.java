public class Id328_Odd_Even_Linked_List {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode.print(ListNode.oddEvenList(node));

        node = new ListNode(2,new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4,
                new ListNode(7)))))));
        ListNode.print(ListNode.oddEvenList(node));

        node = new ListNode(1);
        ListNode.print(ListNode.oddEvenList(node));

        node = new ListNode(1,new ListNode(11));
        ListNode.print(ListNode.oddEvenList(node));
    }
}
