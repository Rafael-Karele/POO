package org.state;

public class Verde implements Estado {
    @Override
    public void acao(Semaforo semaforo) {
        System.out.println("Luz verde: pode seguir.");
        semaforo.setEstado(new Amarelo());
    }
}
