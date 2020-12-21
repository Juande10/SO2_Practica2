package acopio;

import java.util.Random;

public class Persona implements Runnable {
    private gui.Board map;
    
    public Persona(gui.Board m){
        map = m;
    }

    @Override
    public void run() {

            Random r = new Random();
            int random_number = r.nextInt(9);
            System.out.println("Accion de cliente:     "+random_number);
            try{
                if(random_number <7){
                    map.entregar();
                } else if(random_number >=7){
                    map.recoger();
                }
            }catch(Exception e){
                System.out.println(e);
            }
      

    }
    
}
