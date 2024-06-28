package Dsa_in_java.elementary_ds;

public class CustomQueue {
    int[] Queue;
    int front;
    int rear;
    int size;
    
    public CustomQueue(int size) {
        this.size = size;
        this.Queue = new int[size];
        this.front = -1;
        this.rear = 0; 
    }
    
    public boolean isempty() {
        return front == -1 && rear == 0; 
    }
    
    public boolean isfull() {
        return rear == size; 
    }
    
    public void enqueue(int val) {
        if (isfull()) {
            System.out.println("Overflow");
        } else {
            Queue[rear++] = val; 
            if (front == -1) {
                front = 0; 
            }
        }
    }
    
    public int dequeue() {
        if (isempty()) {
            System.out.println("Underflow");
            return -1; 
        } else {
            int val = Queue[front++];
            if (front == rear) { 
                front = -1;
                rear = 0;
            }
            return val; 
        }
    }
    
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(4);
        queue.enqueue(99);
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.enqueue(10); 
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
