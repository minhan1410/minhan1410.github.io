class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            ListNode nodeNext = node.next;
            node.next = nodeNext.next;
            nodeNext.next = head;
            head = nodeNext;
        }
        return head;
    }

    public static void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;

        ListNode node = head;
        ListNode p = new ListNode();
        ListNode nodeP = p;

        while (node != null) {
            int v = node.val;
            if (v != val) {
                ListNode a = new ListNode(v, null);
                while (nodeP.next != null) {
                    nodeP = nodeP.next;
                }
                nodeP.next = a;
            }
            node = node.next;
        }
        return p.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head;
        }

        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }

        if (count == n) {
            return head.next;
        }
        if (n < 0 || n > count) {
            return null;
        }

        node = head;
        while (node != null) {
            if (count == n + 1) {
                node.next = node.next.next;
            }
            count--;
            node = node.next;
        }
        return head;
    }
}

public class Id206_Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        // ListNode.print(a1);
        // ListNode.print(ListNode.reverseList(a1));

        ListNode b1 = new ListNode();
        ListNode.print(b1);
        ListNode.reverseList(ListNode.reverseList(b1));
    }
}
