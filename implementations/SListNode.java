package implementations;

public class SListNode {
    int data;
    SListNode next;

    public SListNode(int data, SListNode next) {
        this.data = data;
        this.next = next;
    }

    public SListNode(int data) {
        this.data = data;
        this.next = null;
    }

}