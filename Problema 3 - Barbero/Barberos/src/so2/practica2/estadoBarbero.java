package so2.practica2;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Juan de Dios Molina 
 */
public class estadoBarbero implements Runnable{
    JPanel panel;
    JLabel barbero;
    JLabel sillaBarbero;
    JLabel work;
    controlSillas control;
    int barberoDurmiendo; //0 no durmiendo - 1 durmiendo
    
    

    @Override
    public void run() {
      while(true){          
        if(barberoDurmiendo==0){
           //System.out.println("Barbero activo");
        }else{
           //System.out.println("Barbero mimiendo");
        }
        if(barberoDurmiendo==0 && control.sillaBarbero==0 && control.clientesEspera()==0){
            stateBarbero();
        }
          
          
       }  
    }
    
    public estadoBarbero(controlSillas control, JLabel barbero, JLabel sillaBarbero,  JPanel panel, JLabel work) {
        this.control = control;
        this.barberoDurmiendo = 0;
        this.barbero = barbero;
        this.sillaBarbero = sillaBarbero;
        this.panel = panel;
        this.sillaBarbero.setOpaque(true);
        this.barbero.setOpaque(true);
        this.work = work;
    }
    
    public void stateBarbero(){
        try {
            //El barbero esta durmiendo por lo tanto 
            barbero.setBackground(Color.red);
            sillaBarbero.setBackground(Color.red);
            barbero.setText("Mimidos");
            work.setText("Mimiendo...");
            barberoDurmiendo = 1;
            control.sillaBarbero = 1;
            
            System.out.println("Barbero se quedo mimido.");
            synchronized(this){
                wait();
            }
            System.out.println("El barbero se yepeto");
            
            sillaBarbero.setBackground(Color.GREEN);
            barbero.setBackground(Color.GREEN);
            barbero.setText("Trabajanding");
            
            work.setText("Trabajanding...");
            barberoDurmiendo = 0;
            control.sillaBarbero = 0;
         
        } catch (InterruptedException e) {
            Logger.getLogger(estadoBarbero.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    
}
