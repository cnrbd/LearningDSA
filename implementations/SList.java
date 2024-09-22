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
        // after the while loop the curr node is the last node of the linked list
        curr.next = newNode;
    }

    public int size() {
        int count = 0;

        if (head == null) {
            return -1;
        }
        SListNode curr = head;

        // by doing curr != null, the loop iterates to the last node
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public int max() {
        if (head == null) {
            return -1;
        }
        // start at the node after the first one so we dont compare max to the same
        // value to avoid redudancy
        SListNode curr = head.next;
        int max = head.data;
        while (curr != null) {
            if (curr.data > max) {
                max = curr.data;
            }
            curr = curr.next;
        }
        return max;

    }

    public int min() {

        if (head == null) {
            return -1;
        }

        SListNode curr = head.next;
        int min = head.data;

        while (curr != null) {
            if (curr.data < min) {
                min = curr.data;
            }
            curr = curr.next;
        }
        return min;
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
