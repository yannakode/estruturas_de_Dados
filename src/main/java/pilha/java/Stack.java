package pilha.java;

public class Stack {
    private int maxLength;
    private int top;
    private int[] elements;

    public Stack(int maxLength){
        this.maxLength = maxLength;
        this.top = -1;
        this.elements = new int[maxLength];
    }

    public boolean empty(){
        return top == -1;
    }

    public boolean full(){
        return top == maxLength -1;
    }

    public void push(int element){
        if(full()){
            System.out.println("stack is full");
        }
        top++;
        elements[top] = element;
    }

    public int pop(){
        if(empty()){
            System.out.println("stack is empty");
            return -1;
        }
        int poppedElement = elements[top];
        top--;
        return poppedElement;
    }

    public int top(){
        if(empty()){
            System.out.println("empty list");
            return -1;
        }
        return elements[top];
    }

    public int length(){
        return top +1;
    }
}
