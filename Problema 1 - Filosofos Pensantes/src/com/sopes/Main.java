package com.sopes;

public class Main {
    public static void main(String[] args) throws Exception {

        final Filosofo[] filosofos = new Filosofo[5];
        Object[] cubiertos = new Object[filosofos.length];

        for (int i = 0; i < cubiertos.length; i++) {
            cubiertos[i] = new Object();
        }

        for (int i = 0; i < filosofos.length; i++) {
            Object leftFork = cubiertos[i];
            Object rightFork = cubiertos[(i + 1) % cubiertos.length];

            if (i == filosofos.length - 1) {

                // El ultimo filosofo toma el cubierto de la derecha primero
                filosofos[i] = new Filosofo(rightFork, leftFork);
            } else {
                filosofos[i] = new Filosofo(leftFork, rightFork);
            }

            Thread t
                    = new Thread(filosofos[i], "Filosofo_ " + (i + 1));
            t.start();
        }
    }
}
