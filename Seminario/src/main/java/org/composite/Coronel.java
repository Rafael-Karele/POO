package org.composite;

// Cliente
public class Coronel {
    private UnidadeMilitar unidadeMilitar;

    public Coronel(UnidadeMilitar unidadeMilitar) {
        this.unidadeMilitar = unidadeMilitar;
    }

    public void darOrdemCapinar() {
        unidadeMilitar.capinar();
    }
}