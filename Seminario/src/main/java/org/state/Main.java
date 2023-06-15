package org.state;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        for (int i = 0; i < 6; i++) {
            semaforo.mudar();
        }
    }
}

