// class ListNode{
//     int val;
//     ListNode next;

//     public ListNode() {
//     }

//     public ListNode(int val) {
//         this.val = val;
//     }

//     public ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class MyLinkedList {
    private ListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        ListNode node = head;
        int count = 0;

        while (node != null) {
            if (count == index) {
                return node.val;
            }
            count++;
            node = node.next;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        head = new ListNode(val, head);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = head;
        if (node == null) {
            head = new ListNode(val);
        } else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = new ListNode(val);
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        } else {
            ListNode node = head;
            int count = 0;

            while (node != null) {
                if (count == index - 1) {
                    node.next = new ListNode(val, node.next);
                    return;
                }

                count++;
                node = node.next;
            }

            if (index == count) {
                addAtTail(val);
                return;
            }

            if (index > count) {
                return;
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode node = head;
        int count = 0;
        while (node.next != null) {
            if (count == index - 1) {
                node.next = node.next.next;
                return;
            }
            count++;
            node = node.next;
        }
    }

    public void print() {
        System.out.print("In: ");
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

public class Id707_Design_Linked_List {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        System.out.println(myLinkedList.get(0));

    }
}
