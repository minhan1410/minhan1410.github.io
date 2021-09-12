class Node<T> {
    T val;
    Node<T> next;

    public Node() {
    }

    public Node(T val) {
        this.val = val;
    }

    public Node(T val, Node<T> next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        String result = val + ", ";
        if (next != null) {
            result += next.toString();
        }
        return result;
    }
}

public class ListNodeGeneric<T> {
    Node<T> head;

    public ListNodeGeneric(Node<T> head) {
        this.head = head;
    }

    public void insert(T val, int index) {
        if (index == 0) {
            head = new Node<T>(val, head);
        }

        Node<T> node = head;
        int i = 0;
        for (; i < index - 1 && node.next != null; i++) {
            node = node.next;
        }
        if (index <= i + 1) {
            node.next = new Node<T>(val, node.next);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 2; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }
    }

    @Override
    public String toString() {
        if(head == null) {
            return "";
        }
        return head.toString();
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(0, new Node<>(3, new Node<>(5, new Node<>(6))));
        ListNodeGeneric<Integer> list = new ListNodeGeneric<Integer>(head);

        System.out.println(list);

        list.insert(1, 1);
        System.out.println(list);

        list.insert(2, 2);
        System.out.println(list);

        list.insert(4, 4);
        System.out.println(list);

        list.remove(7);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

    }
}
