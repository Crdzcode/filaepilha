package Pilha;

import java.util.Stack;

public class MainPilha {
    public static void main(String[] args) {
     /* Pilha pilha1 = new Pilha();
        pilha1.push("Patati");
        System.out.println(pilha1);
        pilha1.push("Patata");
        System.out.println(pilha1);
        String x = pilha1.pop();
        System.out.println(x);
        String x2 = pilha1.pop();
        System.out.println(x2);
        System.out.println(pilha1.vazio());
        pilha1.push("Marcelo");
        System.out.println(pilha1.vazio());*/

        Stack<String> pilha = new Stack<String>();

        pilha.push("Patati");
        pilha.push("Patata");

        System.out.println(pilha);

        System.out.println(pilha.pop());

        System.out.println(pilha);

        String peek = pilha.peek();

        System.out.println(peek);

        System.out.println(pilha);
    }
}
