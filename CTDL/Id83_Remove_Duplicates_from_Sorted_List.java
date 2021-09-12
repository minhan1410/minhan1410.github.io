public class Id83_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode b = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.println(ListNode.deleteDuplicates(a));
        System.out.println(ListNode.deleteDuplicates(b));

        ListNode c = new ListNode(1, new ListNode(1, new ListNode(1)));
        System.out.println(ListNode.deleteDuplicates(c));
    }
}
