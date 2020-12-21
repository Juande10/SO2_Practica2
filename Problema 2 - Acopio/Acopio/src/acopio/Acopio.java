package acopio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Acopio {
    public static void main(String[] args) throws Exception {
        gui.Board gui = new gui.Board(); 
        ExecutorService  ejecutor = Executors.newCachedThreadPool();
       
        for (int i = 0; i < 10; i++) {
            ejecutor.execute( new Persona(gui));
            Thread.sleep(200);
            gui.repaint();
        }

        ejecutor.shutdown();
    }
}