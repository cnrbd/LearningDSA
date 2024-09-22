package implementations;

import java.util.*;

public class Playground {
    public static void main(String[] args) {

        // Stack<Integer> stack = new Stack<>();
        // Stack<Integer> stack2 = new Stack<>();
        // Queue<Integer> q = new LinkedList<>();

        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // System.out.println("stack 1: " + stack);

        // System.out.println(stack2);
        // while (!stack.isEmpty()) {
        // stack2.push(stack.pop());
        // System.out.println(stack2);
        // } // moving stack 1 to stack 2 reverses the order of stack1, instead 4 being
        // the
        // // top of stack1 4 is now the bottom of stack2
        // System.out.println("\n");

        // while (!stack2.isEmpty()) {
        // stack.add(stack2.pop());
        // System.out.println(stack);
        // } // move stack2 into stack1, stack 1 gets back its original order.

        // MIRRORING S1
        Stack<Integer> s1 = new Stack<>();
        Queue<Integer> qq = new LinkedList<>();

        s1.push(10);
        s1.push(50);
        s1.push(19);
        s1.push(54);
        s1.push(30);
        s1.push(67);

        while (!s1.isEmpty()) {
            qq.add(s1.pop());
            System.out.println(qq);
        }

        while (!qq.isEmpty()) { // s1 is in reverse order
            s1.push(qq.remove());
            System.out.println(s1);
        }

        while (!s1.isEmpty()) {
            qq.add(s1.pop());
            System.out.println(qq);
        }
        // if q DQ back into s1. s1 would be in its origial order. this is important for
        // the next step
        // if q is the same order as s1. then if s1 values move to q, q would have
        // mirrored elements

        for (int i = 0; i < 6; i++) {
            int num = qq.remove();
            s1.push(num);
            qq.add(num);
        }
        // now q and s1 are in the same order
        System.out.println("q: " + qq);
        System.out.println("s1: " + s1);

        // empty out s1:
        while (!s1.isEmpty()) {
            qq.add(s1.pop());
            System.out.println(qq);
        }

        // q is now twice as long as the original s1.

        // empty out q. since q is in mirrored order so pushing back to s1 would
        // maintain the same order regardless
        while (!qq.isEmpty()) {
            s1.push(qq.remove());
            System.out.println(s1);
        }
    }

}
