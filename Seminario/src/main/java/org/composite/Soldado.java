package org.composite;

// Folha
class Soldado implements ComponenteMilitar {
    private String nome;

    public Soldado(String nome) {
        this.nome = nome;
    }

    public void capinar() {
        System.out.println(nome + " está capinando.");
    }
}
