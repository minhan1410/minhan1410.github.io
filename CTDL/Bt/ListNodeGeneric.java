public class ListNodeGeneric<T> {
    T val;
    ListNodeGeneric<T> next;

    public ListNodeGeneric() {
    }

    public ListNodeGeneric(T value) {
        this.val = value;
    }

    public ListNodeGeneric(T value, ListNodeGeneric<T> next) {
        this.val = value;
        this.next = next;
    }

    public void addToHead(T value) {
        ListNodeGeneric<T> headNext = new ListNodeGeneric<T>(val, next);
        this.val = value;
        this.next = headNext;
    }

    public void addToTail(T value) {
        ListNodeGeneric<T> node = next;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new ListNodeGeneric<T>(value);
    }

    public void insert(T value, int index) {
        ListNodeGeneric<T> node = this;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        ListNodeGeneric<T> newNode = new ListNodeGeneric<T>(value, node.next);
        node.next = newNode;
    }

    @Override
    public String toString() {
        String result = val + ", ";
        if (next != null) {
            result = result + next.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        ListNodeGeneric<Integer> head = new ListNodeGeneric<Integer>(2,
                new ListNodeGeneric<>(3, new ListNodeGeneric<>(5, new ListNodeGeneric<>(9))));
        System.out.println(head);

        head.addToHead(1);
        System.out.println(head);

        head.addToTail(10);
        System.out.println(head);

        head.insert(4, 3);
        head.insert(6, 5);
        head.insert(7, 6);
        head.insert(8, 7);
        System.out.println(head);
    }
}
