package implementations;

public class SList {

    SListNode head;

    public void insert(int data) {
        SListNode newNode = new SListNode(data);

        if (head.next == null) {
            head = newNode;
            return;
        }
        SListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
}
