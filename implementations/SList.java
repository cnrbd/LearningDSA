package implementations;

public class SList {

    SListNode head;

    public SList() {
        this.head = null;
    }

    public void insert(int data) {
        SListNode newNode = new SListNode(data);

        // check if the linked list is empty and this node will be the first one added
        if (head == null) {
            head = newNode;
            return;
        }
        SListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        SListNode curr = head;
        String str = "[";
        while (curr.next != null) {
            str += curr.data + ", ";
            curr = curr.next;
        }
        // The while loop will terminate when it reaches the last node since .next is
        // null
        str += curr.data + "]";
        return str;
    }
}
