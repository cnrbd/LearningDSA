package implementations;

import java.util.*;

public class Playground {
    public static void main(String[] args) {

        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(0, 2);
        link.push(3);
        link.remove();
        System.out.println(link.getFirst());
        System.out.println(link);
    }

}
