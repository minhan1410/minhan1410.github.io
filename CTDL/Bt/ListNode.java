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

            System.out.print("-> ");ListNode.print(head);
        }
        return head;
    }

    // public static ListNode removeElements1(ListNode head, int val) {
    //     // 1ms 40.1 MB
    //     if (head == null)
    //         return head;

    //     ListNode node = head;
    //     ListNode p = new ListNode();
    //     ListNode nodeP = p;

    //     while (node != null) {
    //         int v = node.val;
    //         if (v != val) {
    //             ListNode a = new ListNode(v, null);
    //             while (nodeP.next != null) {
    //                 nodeP = nodeP.next;
    //             }
    //             nodeP.next = a;
    //         }
    //         node = node.next;
    //     }
    //     return p.next;
    // }

    public static ListNode removeElements(ListNode head, int val) {
        // 1ms 39.8 MB
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode before = null;
        while(node != null){
            if(node == head && node.val == val){
                head = head.next;
                node = head;
            }else{
                if(node.val == val){
                    before.next = node.next;
                }else{
                    before = node;
                }
                node = node.next;
            }
        }
        return head;
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
    // Set<ListNode> set = new LinkedHashSet<ListNode>();
    // ListNode node = head;
    // while (node != null) {
    // if (!set.add(node)) {
    // return true;
    // }
    // node = node.next;
    // }
    // return false;
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
    // Set<ListNode> set = new LinkedHashSet<ListNode>();
    // ListNode node = head;
    // while (node != null) {
    // if (!set.add(node)) {
    // return node;
    // }
    // node = node.next;
    // }
    // return null;
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA, nodeB = headB;

        while (nodeA != nodeB) {
            nodeA = nodeA != null ? nodeA.next : headB;

            nodeB = nodeB != null ? nodeB.next : headA;
        }

        return nodeA;
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }


        ListNode odd = new ListNode(head.val);
        ListNode even = new ListNode(head.next.val);

        ListNode node = head.next.next;
        ListNode nodeOdd = odd;
        ListNode nodeEven = even;

        while(node != null){
            nodeOdd.next = new ListNode(node.val);
            nodeOdd = nodeOdd.next;

            if(node.next == null){
                break;
            }

            nodeEven.next = new ListNode(node.next.val);
            nodeEven = nodeEven.next;

            node = node.next.next;
        }

        while(nodeOdd.next != null){
            nodeOdd = nodeOdd.next;
        }
        nodeOdd.next = even;

        return odd;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + "]";
    }
}
