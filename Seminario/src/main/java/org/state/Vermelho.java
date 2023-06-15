package org.state;

public class Vermelho implements Estado {
    @Override
    public void acao(Semaforo semaforo) {
        System.out.println("Luz vermelha: pare.");
        semaforo.setEstado(new Verde());
    }
}