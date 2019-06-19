package com.leetcode.minstack;


import java.util.ArrayDeque;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {
    private final ArrayDeque<Integer> minStory = new ArrayDeque<>();
    private final ArrayDeque<Integer> arrayList = new ArrayDeque<>();

    private int min;

    /**
     * initialize your data structure here.
     */
    MinStack() {

    }

    public void push(int x) {
        arrayList.push(x);
        if (minStory.isEmpty() || x <= minStory.peek()) {
            min = x;
            minStory.push(min);
        }
    }

    public void pop() {
        if (minStory.peek().equals(arrayList.peek())) {
            minStory.pop();
            if (!minStory.isEmpty()) {
                min = minStory.peek();
            }
        }
        arrayList.pop();
    }

    public int top() {
        return arrayList.getFirst();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
