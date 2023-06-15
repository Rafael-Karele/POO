package org.state;

public class Semaforo {
    private Estado estado;

    public Semaforo() {
        this.estado = new Vermelho();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void mudar() {
        estado.acao(this);
    }
}
