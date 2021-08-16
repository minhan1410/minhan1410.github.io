import java.util.LinkedHashSet;
import java.util.Set;

public class ListNode {
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

    // C1:4 ms
    // public static boolean hasCycle(ListNode head) {
    //     Set<ListNode> set = new LinkedHashSet<ListNode>();
    //     ListNode node = head;
    //     while (node != null) {
    //         if (!set.add(node)) {
    //             return true;
    //         }
    //         node = node.next;
    //     }
    //     return false;
    // }

    // C2: 0ms
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    // C1:4 ms
    // public static ListNode detectCycle(ListNode head) {
    //     Set<ListNode> set = new LinkedHashSet<ListNode>();
    //     ListNode node = head;
    //     while (node != null) {
    //         if (!set.add(node)) {
    //             return node;
    //         }
    //         node = node.next;
    //     }
    //     return null;
    // }

    // C2: 0ms
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }
        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val+ "]";
    }
}
