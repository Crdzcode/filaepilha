package Fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<String> nomes = new LinkedList<String>();

    public void adiciona(String nome){
        nomes.add(nome);
    }

    public String remove(){
        return nomes.remove(0);
    }

    public boolean vazio(){
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
