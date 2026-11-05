package test;

import istiklal.edu.tr.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("Element 1");
        stack1.push("Element 2");
        stack1.push("Element 3");

        MyStack stack2 = (MyStack) stack1.clone();
        stack2.push("Element 4");

        System.out.println("Stack 1 size: " + stack1.getSize());
        System.out.println("Stack 1 contents: " + stack1);
        System.out.println("Stack 2 size: " + stack2.getSize());
        System.out.println("Stack 2 contents: " + stack2);
    }
}