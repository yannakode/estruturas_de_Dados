package pilha;

import pilha.java.Stack;

public class Main {
    public static void main(String[] args) {
        Stack pilha = new Stack(2);
        pilha.push(1);
        pilha.push(2);
        pilha.pop();
        System.out.println(pilha.full());
    }
}
