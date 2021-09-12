public class Id160_Intersection_of_Two_Linked_Lists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode a1 = new ListNode(1);
        headA.next = a1;

        ListNode c1 = new ListNode(8, new ListNode(4, new ListNode(5)));

        ListNode headB = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(1);
        headB.next = b1;
        b1.next = b2;

        a1.next = c1;
        b2.next = c1;

        System.out.println(ListNode.getIntersectionNode(headA, headB));
        ;
    }
}
