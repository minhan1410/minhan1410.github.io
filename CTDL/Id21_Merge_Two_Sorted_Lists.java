public class Id21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(ListNode.mergeTwoLists(l1, l2));
    }
}
