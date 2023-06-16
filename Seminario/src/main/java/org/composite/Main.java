package org.composite;

public class Main {
    public static void main(String[] args) {
        // Criando soldados (folhas)
        Soldado soldado1 = new Soldado("Soldado 1");
        Soldado soldado2 = new Soldado("Soldado 2");
        Soldado soldado3 = new Soldado("Soldado 3");

        // Criando uma equipe (composite)
        UnidadeMilitar equipe = new UnidadeMilitar();
        equipe.adicionar(soldado1);
        equipe.adicionar(soldado2);

        // Criando uma esquadra (composite)
        UnidadeMilitar esquadra = new UnidadeMilitar();
        esquadra.adicionar(equipe);
        esquadra.adicionar(soldado3);

        // O coronel dá a ordem de capinar para a esquadra
        Coronel coronel = new Coronel(esquadra);
        coronel.darOrdemCapinar();
    }
}
