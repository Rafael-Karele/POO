package org.state;

public class Amarelo implements Estado {
    @Override
    public void acao(Semaforo semaforo) {
        System.out.println("Luz amarela: prepare-se para parar.");
        semaforo.setEstado(new Vermelho());
    }
}