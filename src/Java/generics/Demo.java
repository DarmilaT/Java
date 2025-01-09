package Java.generics;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }
    // Push an element onto the stack
    public void push(T item) {
        stack.addFirst(item);
    }
    // Pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeFirst();
    }
    // Peek at the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getFirst();
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack<TwoD> stack = new Stack<>();
    }
}
