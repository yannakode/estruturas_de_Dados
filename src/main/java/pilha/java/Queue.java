package pilha.java;

public class Queue {
    private int[] array;
    private int length;
    private int capacity;
    private int front;
    private int rear;

    public Queue(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        length = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isFull(){
        return length == capacity;
    }

    public int size(){
        return length;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is already full");
        }
        array[++rear] = element;
        length++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int temp = array[front++];
        length--;
        return temp;
    }

    public int firstElement(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        return array[front];
    }
}
