public class Id234_Palindrome_Linked_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(ListNode.isPalindrome(head));

        head = new ListNode(1, new ListNode(2));
        System.out.println(ListNode.isPalindrome(head));

        head = new ListNode(1);
        System.out.println(ListNode.isPalindrome(head));

        head = new ListNode();
        System.out.println(ListNode.isPalindrome(head));

        head = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(1)))))));
        System.out.println(ListNode.isPalindrome(head));

        head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))));
        System.out.println(ListNode.isPalindrome(head));

    }
}
