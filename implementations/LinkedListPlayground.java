package implementations;

public class LinkedListPlayground {
    public static void main(String[] args) {
        SList linky = new SList();

        linky.insert(1);
        linky.insert(4);
        linky.insert(2);
        linky.insert(-5);
        System.out.println(linky.min());
    }
}
