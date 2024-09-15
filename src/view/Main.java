package view;

import br.edu.fateczl.pilha.PilhaString;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaString pilha = new PilhaString();
        pilha.push("J");
        pilha.push("G");
        pilha.push("R");
        pilha.push("B");
        pilha.push("H");
        pilha.push("L");
        pilha.push("W");

        String w = pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        String r = pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println(r + " " + w);

        pilha.push("L");
        pilha.push("B");
        pilha.push("M");
        pilha.push("G");
        pilha.push("K");

        while (!pilha.isEmpty()) {
            System.out.println("Pilha final: " + pilha.pop());
        }
    }
}
