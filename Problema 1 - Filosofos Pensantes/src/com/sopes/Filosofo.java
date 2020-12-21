package com.sopes;

public class Filosofo implements Runnable {
    // The forks on either side of this Philosopher
    private Object cubiertoIzquierda;
    private Object cubiertoDerecha;

    public Filosofo(Object leftFork, Object rightFork) {
        this.cubiertoIzquierda = leftFork;
        this.cubiertoDerecha = rightFork;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(
                Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 1000)));
    }

    @Override
    public void run() {
        try {
            while (true) {

                // pensando
                doAction(System.nanoTime() + ": Pensando");
                synchronized (cubiertoIzquierda) {
                    doAction(
                            System.nanoTime()
                                    + ": Levanta el cubierto izquierdo");
                    synchronized (cubiertoDerecha) {
                        // eating
                        doAction(
                                System.nanoTime()
                                        + ": Levanto el cubierto derecho - comiendo");

                        doAction(
                                System.nanoTime()
                                        + ": Puso el cubierto en la mesa");
                    }

                    // Back to thinking
                    doAction(
                            System.nanoTime()
                                    + ": Puso el cubierto izquierdo en la mesa. Ahora esta pensando");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
