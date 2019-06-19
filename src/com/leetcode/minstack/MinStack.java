package com.leetcode.minstack;


import java.util.ArrayDeque;

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
