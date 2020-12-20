package so2.practica2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan de Dios Molina
 */
public class controlSillas implements Runnable{

    //parte grafica
    JLabel barberor;
    JLabel sillaBar;
    JPanel jpanel;
    Label[] arrSillas;
    JLabel work;
    //parte analisis
    int num_sillas;       // 20 de fijo
    int sillasOcupadas; //clientesEsper
    int sillaBarbero;   //0 desocupada - 1 ocupada

    public controlSillas( JLabel barberor,  JLabel sillaBar,  JPanel panel, Label[] arr, JLabel work) {
        this.num_sillas = 20;
        this.sillaBarbero = 0;
        this.sillasOcupadas = 0;
        this.barberor = barberor;
       
        this.sillaBar = sillaBar;
        this.arrSillas = arr;
        this.jpanel = panel;
        this.work = work;
    }

    @Override
    public void run() {
        while(true){
            
        }
    }
    
    
    public int clientesEspera(){
        return sillasOcupadas;
    }
    
    public synchronized void ejecutarAccion(int noCliente){
        try {
            sillaBarbero = 1;
            sillasOcupadas--;
            sillaBar.setText("Atendiendo cliente "+noCliente);            
            //System.out.println("SILLAS OCUPADAS 1: "+sillasOcupadas);           
            Component[] pan = jpanel.getComponents();
            //System.out.println("VALORES COMPONENTES"+pan.length);
            for(int x=0; x < 20; x++){
                if(!(x < sillasOcupadas)){
                    String name = "lab"+x;
                    String nameLab = pan[x].getName();
                    //System.out.println("Nombre label "+nameLab);
                    if(name.equals(nameLab)){
                        ((Label)pan[x]).setBackground(Color.WHITE);
                    }
                }else{
                    ((Label)pan[x]).setBackground(Color.green);
                }
            }
            //System.out.println("Barbero ocupado por cliente numero "+noCliente);
            barberor.setText("Trabajanding");
            
            int x = 0;
          
            work.setText("trabajando...");
          
            Thread.sleep(1500); //Taza de servicio
             
            sillaBarbero = 0;
            System.out.println("Cliente esperando: "+sillasOcupadas);
            System.out.println("SILLAS OCUPADAS 2: "+sillasOcupadas);
           
            sillaBar.setText("desocupado");
            
        } catch (InterruptedException e) {
            Logger.getLogger(estadoBarbero.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
