package so2.practica2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Juan de Dios Molina
 */
public class estadoCliente implements Runnable{
    
    JPanel jpanel;      
    JLabel valBarbero;
    controlSillas control;
    estadoBarbero barbero;
    int noClientes;
    
    public estadoCliente(controlSillas control, estadoBarbero barbero, int noClientes,  JLabel statusBarber, JPanel panel) {
        System.out.println("No de clientes esperando "+noClientes);
        this.control = control;
        this.barbero = barbero;
        this.noClientes = noClientes;
        this.jpanel = panel;
        this.valBarbero = statusBarber;
        control.sillasOcupadas++;
        Component[] pan = jpanel.getComponents();
        for(int x=0; x < 20; x++){
            if(x < control.sillasOcupadas){
                String name = "lab"+x;
                String nameLab = pan[x].getName();
                if(name.equals(nameLab)){
                    ((Label)pan[x]).setBackground(Color.green);
                }
            }else{
                 break;
            }
        }
    }

    
    @Override
    public void run() {
        if(barbero.barberoDurmiendo==1){
            System.out.println("Despertar al barbero");
            synchronized(barbero){
                barbero.notify();
            }
        }
        while(true){
            if(Thread.currentThread().isAlive()){
                if(control.sillaBarbero==0){
                    control.ejecutarAccion(this.noClientes);       
                    break;
                }
            }
        }
    }
}
