public class Id141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(-4);

        a1.next= a2;a2.next= a3;a3.next=a4;a4.next=a2;

        System.out.println(ListNode.hasCycle(a1));
    }
}
