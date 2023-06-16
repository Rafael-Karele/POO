package org.composite;

import java.util.List;
import java.util.ArrayList;

// Composite
class UnidadeMilitar implements ComponenteMilitar {
    private List<ComponenteMilitar> componentes = new ArrayList<>();

    public void adicionar(ComponenteMilitar componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteMilitar componente) {
        componentes.remove(componente);
    }

    public void capinar() {
        for (ComponenteMilitar componente : componentes) {
            componente.capinar();
        }
    }
}