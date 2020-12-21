## Problema de los filosofos pensantes

El problema de Dining Philosophers es uno de los problemas clásicos que se utilizan para describir problemas de sincronización en un entorno de subprocesos múltiples e ilustrar técnicas para resolverlos. Dijkstra primero formuló este problema y lo presentó con respecto a las computadoras que acceden a los periféricos de la unidad de cinta.

La presente formulación fue dada por Tony Hoare, quien también es conocido por inventar el algoritmo de clasificación rápida. Analizamos este conocido problema y codificamos una solución popular.

![comenzales](https://sopes2.s3.amazonaws.com/vsdvsv.png)

El diagrama de arriba representa el problema. Hay cinco filósofos silenciosos (P1 - P5) sentados alrededor de una mesa circular, pasándose la vida comiendo y pensando.

Hay cinco tenedores para compartir (1 - 5) y para poder comer, un filósofo necesita tener tenedores en ambas manos. Después de comer, los deja a ambos y luego pueden ser recogidos por otro filósofo que repite el mismo ciclo.

Una solución inicial sería hacer que cada uno de los filósofos siguiera el siguiente protocolo:

```
while(true) { 
    // Inicialmente pensando sobre la vida, el universo y asi.
    piensa();

    // Si bueno, quien tiene hambre?
    pick_up_left_fork();
    pick_up_right_fork();
    eat();
    put_down_right_fork();
    put_down_left_fork();

    // Barriga llena corazon content, volvamos a  pensar
}
```

Como describe el pseudocódigo anterior, cada filósofo está pensando inicialmente. Después de cierto tiempo, el filósofo tiene hambre y desea comer.

En este punto, alcanza los tenedores a cada lado y una vez que los tiene, procede a comer. Una vez que se ha terminado de comer, el filósofo baja los tenedores para que estén disponibles para su vecino.

Modelamos a cada uno de nuestros filósofos como clases que implementan la interfaz Runnable para que podamos ejecutarlos como subprocesos separados. Cada filósofo tiene acceso a dos tenedores en su lado izquierdo y derecho:

```
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
    public void run() {}
    
```

Como se muestra en el código anterior, cada acción se simula suspendiendo el subproceso de invocación durante un período de tiempo aleatorio, de modo que la orden de ejecución no se aplique solo por tiempo.

Ahora, implementemos la lógica central de un filósofo.

Para simular la adquisición de un cubierto, necesitamos bloquearlo para que dos subprocesos no la adquieran al mismo tiempo.

Para lograr esto, usamos la palabra clave synchronized para adquirir el monitor interno del objeto fork y evitar que otros subprocesos hagan lo mismo. Puede encontrar una guía de la palabra clave [synchronized en Java aquí](https://ricardogeek.com/sincronizacion-de-threads-en-java/). Procedemos ahora a implementar el método run () en la clase Filosofo:
```
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
 ```
 
 Este esquema implementa exactamente el descrito anteriormente: un filósofo piensa por un tiempo y luego decide comer.
 
 Después de esto, adquiere los tenedores a su izquierda y derecha y comienza a comer. Cuando termina, coloca los tenedores. También agregamos marcas de tiempo a cada acción, lo que nos ayudaría a comprender el orden en que ocurren los eventos.
 
 Para poner en marcha todo el proceso, escribimos un cliente que crea 5 filósofos como hilos y los inicia todos:
 
```
public static void main(String[] args) throws Exception {

        final Filosofo[] filosofos = new Filosofo[5];
        Object[] cubiertos = new Object[filosofos.length];

        for (int i = 0; i < cubiertos.length; i++) {
            cubiertos[i] = new Object();
        }

        for (int i = 0; i < filosofos.length; i++) {
            Object izquierdo = cubiertos[i];
            Object derecho = cubiertos[(i + 1) % cubiertos.length];
           
            filosofos[i] = new Filosofo(izquierdo, derecho);
                       
            Thread t 
                = new Thread(filosofos[i], "Filosofo_ " + (i + 1));
            t.start();
        }
    }
```

El anterior problema genera un Deadlock, porque en esta situación, cada uno de los Filósofos ha adquirido su tenedor izquierdo, pero no puede adquirir su tenedor derecho, porque su vecino ya lo ha adquirido. Esta situación se conoce comúnmente como espera circular y es una de las condiciones que resulta en un deadlock e impide el progreso del sistema.

Para resolver este deadlock basta con hacer un a juste para que el ultimo filosofo tome el tenedor de la derecha primero y tenga chance ded comer.
```
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
```