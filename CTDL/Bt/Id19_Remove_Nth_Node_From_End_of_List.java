public class Id19_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode.print(ListNode.removeNthFromEnd(a1, 8));
        ListNode.print(ListNode.removeNthFromEnd(a1, 5));
        ListNode.print(ListNode.removeNthFromEnd(a1, 4));
        ListNode.print(ListNode.removeNthFromEnd(a1, 3));
        ListNode.print(ListNode.removeNthFromEnd(a1, 2));
        ListNode.print(ListNode.removeNthFromEnd(a1, 1));
        ListNode.print(ListNode.removeNthFromEnd(a1, 1));
    }
}
