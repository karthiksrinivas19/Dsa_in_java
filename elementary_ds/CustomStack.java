package Dsa_in_java.elementary_ds;

public class CustomStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1; 
    }

    public boolean isempty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isfull()) {
            System.out.println("Overflow");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (isempty()) {
            System.out.println("Underflow");
            return -1; 
        } else {
            return stack[top--];
        }
    }
    public static void main(String[] args) {
        CustomStack stack1= new CustomStack(5);
        stack1.push(25);
        stack1.push(15);
        stack1.pop();
    }
}
