package pilha;

import pilha.java.Queue;
import pilha.java.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack pilha = new Stack(2);
//        pilha.push(1);
//        pilha.push(2);
//        pilha.pop();
//        System.out.println(pilha.full());

        Queue queue = new Queue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        //queue.enqueue(3);
        System.out.println(queue.dequeue());
    }
}
