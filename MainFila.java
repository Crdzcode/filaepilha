package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Patati");
        fila.adiciona("Patata");

        System.out.println(fila);

        String x = fila.remove();

        System.out.println(x);
        System.out.println(fila);

        Queue<String> filaJava = new LinkedList<String>();

        filaJava.add("Patata");
        String x2 = filaJava.poll();
        System.out.println(x2);
    }
}
